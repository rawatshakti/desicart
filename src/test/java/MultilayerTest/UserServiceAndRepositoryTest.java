package MultilayerTest;

import com.desicart.DesicartApplication;
import com.desicart.config.MongoDBConfig;
import com.desicart.data.model.User;
import com.desicart.service.IUserService;
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
public class UserServiceAndRepositoryTest {
    @Autowired
    IUserService userService;

    @Test
 public void TestUser(){

     List<User> userlist=userService.getallUser();
     System.out.println("***All Users Details****");
     userlist.forEach(user -> System.out.println(user.getFirstName() + " - " + user.getLastName()));
     Assert.assertTrue(userlist.size() > 0);

     User user1=new User("","Test1","Test1",
             "Test1","Test1","Test1",
             "Test1","Test1","Test","Test");
     boolean test=userService.saveUser(user1);
        List<User> userlist1=userService.getallUser();
            User usernew=userlist1.get(0);
        Assert.assertEquals("Test", usernew.getFirstName());
 }

}
