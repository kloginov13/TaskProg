import Animal.CatType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Админ on 15.11.2016.
 */
public class CatTypeTest {


    @Test
    public void testgetWho(){
        CatType lion = CatType.Lion;
        assertEquals("I'm the king of the animals",lion.getWho());
    }
}