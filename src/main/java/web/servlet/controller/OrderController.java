package web.servlet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.servlet.model.Order;
import web.servlet.repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository repository;

    @GetMapping(produces = "application/json")
    public @ResponseBody ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(repository.getAllOrders());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Order getOrderById(@PathVariable("id") Integer id) {
        return repository.getOrderById(id);
    }

    @PostMapping(value = "/add")
    public void addOrder(@RequestBody Order order){
        repository.addOrder(order);
    }

}
