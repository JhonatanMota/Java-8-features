import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MethodReference{

    private static List<Product> products = new ArrayList<Product>();
    
    static{
        products.add(new Product(1000, "Geladeira 470L", BigDecimal.valueOf(2900.00)));
		products.add(new Product(2000, "TV UHD 50''", BigDecimal.valueOf(3500.00)));
		products.add(new Product(1001, "TV UHD 65''", BigDecimal.valueOf(5000.00)));
		products.add(new Product(3000, "Microondas 20L", BigDecimal.valueOf(399.00)));
		products.add(new Product(1001, "Geladeira 120L", BigDecimal.valueOf(900.00)));
		products.add(new Product(4000, "Computador i5 2.9Ghz 4GB 1TB HD", BigDecimal.valueOf(2429.00)));
		products.add(new Product(1002, "Geladeira 500L", BigDecimal.valueOf(3100.00)));
    }
    
    public static void main(String[] args){
        
        usingLambda();

        particularObject();

        staticMethod();

        instanceMethod();

        constructorReference();
    }

    /**
     * Referência de um método de instância de um objeto em particular
     */
    private static void particularObject(){
        // instância do objeto específico
        Rectangle rectangle =   new Rectangle();
	    // Method reference - Referência a um método de instância (desenhaRetangulo) de um objeto particular (ret)
        Figure2D figure = rectangle::rectangleDraws;

        figure.draws(12.5, 18.7);
    }

    /**
     * Referência a um método estático
     */
    private static void staticMethod(){
        products.forEach(Printer::print);
    }

    /**
     * Referência a um método de instância
     */
    private static void instanceMethod(){
        products.forEach(Product::print);
    }

    /**
     * Referência a um construtor
     */
    private static void constructorReference(){
        Figure2D figure = Square::new;

        figure.draws(10.1, 10.1);
    }

    private static void usingLambda(){
        //Using lambda expression
        Figure2D figure = (width, height) -> System.out.println("LAMBDA - Desenha retângulo de Largura: " + width + " e Altura: " + height);

        figure.draws(8.0, 2.0);
    }
}

//Functional interface
interface Figure2D{
    void draws(Double width, Double height);
}

class Rectangle{
    public void rectangleDraws(Double width, Double height){
        System.out.println("Desenha retângulo de Largura: " + width + " e Altura: " + height);
    }
}

class Square{
    public Square(Double width, Double height){
        System.out.println("Desenha quadrado de Largura: " + width + " e Altura: " + height);
    }
}

class Printer{
    public static void print(Product p) {
		System.out.println(p.getName() + " = " + p.getPrice());
	}
}