import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestClass {

    @Test
    public void testRectangle() {
        float h1 = (float) 1.2;
        float w1 = (float) 2.1;
        Rectangle tester1 = new Rectangle(w1, h1);
        assertEquals(h1 * w1, tester1.computeArea(), 0.0001);

        float h2 = (float) 1.0;
        float w2 = (float) 0.0;
        Rectangle tester2 = new Rectangle(w2, h2);
        assertEquals(h2 * w2, tester2.computeArea(), 0.0001);

    }


}

