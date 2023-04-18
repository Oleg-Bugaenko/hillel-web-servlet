package web.servlet.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private Integer id;
    private LocalDateTime dateTime;
    private Double totalCost;
    private List<Product> products = new ArrayList<>();

    public Order() {
        this.dateTime = LocalDateTime.now();
        this.totalCost = 0.0;
    }

    public Order(Integer id) {
        this.id = id;
        this.dateTime = LocalDateTime.now();
        this.totalCost = 0.0;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Double getTotalCost() {
        return totalCost;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getCost();
        }
        this.products = products;
    }
}
