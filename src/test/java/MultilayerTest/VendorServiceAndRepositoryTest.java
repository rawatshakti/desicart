package MultilayerTest;

import com.desicart.DesicartApplication;
import com.desicart.config.MongoDBConfig;
import com.desicart.data.model.Product;
import com.desicart.data.model.Vendor;
import com.desicart.service.IProductService;
import com.desicart.service.IVendorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ContextConfiguration(classes = {MongoDBConfig.class, DesicartApplication.class})
@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorServiceAndRepositoryTest {

    @Autowired
    IVendorService vendorService;

    @Test
    public void TestVendors() {

        List<Vendor> list = vendorService.getVendors();
        System.out.println("getProductsByNameLike");
        list.forEach(vendor -> System.out.println(vendor.getId() + " - " + vendor.getName()));
        Assert.assertTrue(list.size() > 0);

    }


} 