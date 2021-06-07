import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;;


public class Stream {
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

        System.out.println("\nUsando Java Streams...");

        //Obtém um fluxo de dados (stream)
		products.stream()

		//Interface Predicate - filtrar os nomes dos produtos que contém 'Geladeira'
		.filter(p -> p.getName().contains("Geladeira"))
		
		//Interface Comparator - ordenar o preço em ordem crescente
		.sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
		
		//Interface Function - aplicar uma dada função (toUpperCase) aos elementos dessa stream
		.map(p -> p.getName().toUpperCase())
		
		//Interface Consumer - percorrer cada elemento da stream e exibi-los no console 
		.forEach(System.out::println);
    }
}
