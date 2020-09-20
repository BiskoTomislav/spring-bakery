package hr.tomi.bakery.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/*
* Lombok annotations -> install IntelliJ plugin to remove errors about final variables
* File -> Settings -> Plugins -> find Lombok plugin and install it.
*/
@Data
@RequiredArgsConstructor
/* JPA requires that entities have a no-arguments constructor, so Lombok’s @NoArgsConstructor does that. */
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Entity
public class Product {
    @Id
    private final String id;

    private final String name;
    private final BigDecimal price;
}
