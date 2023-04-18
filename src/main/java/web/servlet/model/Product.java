package web.servlet.model;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private Double cost;

    public Product(){}

    public Product(Integer id, String name, Double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

}
