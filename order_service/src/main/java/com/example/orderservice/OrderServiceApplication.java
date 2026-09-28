package com.example.orderservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
@RestController
@RequestMapping("/orders")
class OrderController {
    @GetMapping
    public List<String> getOrders() {
        return List.of("Order_101 (Laptop)", "Order_102 (Keyboard)");
    }
}
