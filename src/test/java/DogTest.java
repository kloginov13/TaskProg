import Animal.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Админ on 14.11.2016.
 */
public class DogTest {



    @Test
    public void testGetClassName() throws Exception {
        Dog sharik = new Dog();
        assertEquals("Dog",sharik.getClassName());
    }


}