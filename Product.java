import java.math.BigDecimal;

public class Product {
    private Integer code;
    private String name;
    private BigDecimal price;

    public Product(Integer code, String name, BigDecimal price){
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void print(){
        System.out.println(this.name + " = " + this.price);
    }
}
