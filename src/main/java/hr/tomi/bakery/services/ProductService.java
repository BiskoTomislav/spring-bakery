package hr.tomi.bakery.services;

import hr.tomi.bakery.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
}
