package hr.tomi.bakery.controllers;

import hr.tomi.bakery.data.ProductRepository;
import hr.tomi.bakery.domain.Product;
import hr.tomi.bakery.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class HomeController {

    private final ProductService productService;

    @Autowired
    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Tomislav");
        model.addAttribute("products", productService.getAllProducts());
        log.info("GET /home");
        return "home";
    }
}
