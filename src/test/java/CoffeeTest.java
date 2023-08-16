import lombok.Getter;
import lombok.Setter;
import org.junit.Before;
import org.junit.Test;

import javax.management.ConstructorParameters;

import static org.junit.Assert.*;


public class CoffeeTest {
    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    @Before
    public void setup(){
        actualCoffee = new Coffee("Goof Fofee", "Espresso", 5.99);
    }

    @Test
    public void testCoffeeNoArgConstructor(){
        actualCoffee = new Coffee();
        assertNull(emptyCoffee);
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgConstructor(){
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeGetters(){
        assertEquals(actualCoffee.getName(), "Goof Fofee");
        assertEquals(actualCoffee.getRoast(), "Espresso");
        assertEquals(actualCoffee.getPrice(), 5.99, 0.000001);
    }
    @Test
    public void testCoffeeSetters(){
        actualCoffee.setName("a name goes here");
        assertEquals(actualCoffee.getName(), "a name goes here");
        actualCoffee.setRoast("krispy");
        assertEquals(actualCoffee.getRoast(), "krispy");
        actualCoffee.setPrice(4.20);
        assertEquals(actualCoffee.getPrice(), 4.20, .000001);
    }

}
