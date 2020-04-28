import java.util.List;

import com.desicart.config.MongoDBConfig;
import com.desicart.data.model.Product;
import com.desicart.DesicartApplication;
import com.desicart.service.IProductService;
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
        list.forEach(product -> System.out.println(product.title + " - " + product.vendor));

        list = productService.getProductsByVendor("Rustic LTD");
        System.out.println("getProductsByVendor");
        list.forEach(product -> System.out.println(product.title + " - " + product.vendor));

        list = productService.getProductsByType("Indoor");
        System.out.println("getProductsByType");
        list.forEach(product -> System.out.println(product.title + " - " + product.vendor));

        list = productService.getProductsByVendorAndName("Rustic LTD", "Sofa");
        System.out.println("getProductsByVendorAndName");
        list.forEach(product -> System.out.println(product.title + " - " + product.vendor));
    }

    public List<Product> getProducts() {
        return productService.getProducts();
    }

    public List<Product> getProductsByVendor(String vendor) {
        return productService.getProductsByVendor(vendor);
    }

    public List<Product> getProductsByType(String type) {
        return productService.getProductsByType(type);
    }

    public List<Product> getProductsByNameLike(String name) {
        return productService.getProductsByNameLike(name);
    }

    public List<Product> getProductsByVendorAndName(String vendor, String name) {
        return productService.getProductsByVendorAndName(vendor, name);
    }

    public boolean updateProduct(Product product) {
        return false;
    }

    public boolean insertProduct(Product product) {
        return false;
    }

    public boolean deleteProduct(String productId) {
        return false;
    }
} 