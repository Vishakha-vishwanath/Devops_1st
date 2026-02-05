import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
public class gradeCalcTest {
    gradeCalc gradeCalculation =   new gradeCalc();

    @BeforeEach
    void setup(){
        gradeCalculation =   new gradeCalc();
    }
    @Test
    @DisplayName("Tests for if else if")

    public void testForo(){
      Assert.assertEquals("O" , gradeCalculation.grade(99));
      System.out.println("GRADE is O");
    }
    

}