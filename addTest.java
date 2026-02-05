
import java.beans.Transient;
import org.junit.*;

public class addTest {
    @Test
   public void test1forAdd(){
       add add_var = new add();
       Assert.assertEquals(7 , add_var.addNumbers(3 ,4));
       Assert.assertEquals(201 , add_var.addNumbers(201 ,  0));
       Assert.assertEquals(-7 , add_var.addNumbers(-3 ,  -4));
       Assert.assertEquals(Math.addExact(-3 , -4) , add_var.addNumbers(-3 ,  -4));
   }

}
