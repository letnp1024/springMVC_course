package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloApplication {
    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot";
    }

}
