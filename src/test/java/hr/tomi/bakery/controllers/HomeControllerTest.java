package hr.tomi.bakery.controllers;

import hr.tomi.bakery.data.ProductRepository;
import hr.tomi.bakery.domain.Product;
import hr.tomi.bakery.services.ProductService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Before
    public void setUp() {
        Product product = new Product("DNT", "Donat", BigDecimal.valueOf(0.99));

        Mockito.when(productService.getAllProducts())
                .thenReturn(Arrays.asList(product));
    }

    /* TODO Add HTMLUnit */
    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))

                .andExpect(status().isOk())

                .andExpect(view().name("home"))

                .andExpect(content().string(containsString("Tomislav")));
    }
}
