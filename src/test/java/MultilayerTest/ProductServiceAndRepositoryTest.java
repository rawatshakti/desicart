package MultilayerTest;

import java.util.List;

import com.desicart.config.MongoDBConfig;
import com.desicart.data.model.Product;
import com.desicart.DesicartApplication;
import com.desicart.service.IProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = {MongoDBConfig.class, DesicartApplication.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceAndRepositoryTest {

    @Autowired
    IProductService productService;// = new ProductService();

    @Test
    public void TestProducts() {

        List<Product> list = productService.getProductsByNameLike("Sofa");
        System.out.println("getProductsByNameLike");
        list.forEach(product -> System.out.println(product.getTitle() + " - " + product.getVendor()));
        Assert.assertTrue(list.size() > 0);

        list = productService.getProductsByVendor("Rustic LTD");
        System.out.println("getProductsByVendor");
        list.forEach(product -> System.out.println(product.getTitle() + " - " + product.getVendor()));
        Assert.assertTrue(list.size() > 0);

        list = productService.getProductsByType("Indoor");
        System.out.println("getProductsByType");
        list.forEach(product -> System.out.println(product.getTitle() + " - " + product.getVendor()));
        Assert.assertTrue(list.size() > 0);

        list = productService.getProductsByVendorAndName("Rustic LTD", "Sofa");
        System.out.println("getProductsByVendorAndName");
        list.forEach(product -> System.out.println(product.getTitle() + " - " + product.getVendor()));
        Assert.assertTrue(list.size() > 0);

    }

} 