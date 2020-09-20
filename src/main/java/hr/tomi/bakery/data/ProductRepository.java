package hr.tomi.bakery.data;

import hr.tomi.bakery.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
