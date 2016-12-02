
import Calc.Calc;
import Calc.CalcException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Админ on 14.11.2016.
 */
@TestInfo(
        priority = TestInfo.Priority.HIGH,
        createdBy = "Konstantin_Loginov",
        tags = {"task1","test" }
)
public class CalcTest {

    private Calc calc;

    @Before
    public void initTest() throws RuntimeException {
        calc = new Calc();
    }

    @After
    public void afterTest() {
        calc = null;
    }
    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, calc.getSum(7,8));
    }

    @UserStorie(userStory = "Деление одного числа на другое")
    @Test
    public void testGetDivide() throws Exception {
        try{
            assertEquals(20, calc.getDivide(100,5));
            assertEquals("Деление на нуль!", calc.getDivide(100,0));


        }
        catch(CalcException ex){

            System.out.println(ex.getMessage());

        }

    }
    @UserStorie(userStory = "Умножение одного числа на другое")
    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(100, calc.getMultiple(50,2));
    }
}
