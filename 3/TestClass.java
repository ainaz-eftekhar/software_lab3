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

    @Test
    public void testChangeHeightWidth() {
        float h = (float) 1.2;
        float w = (float) 2.1;
        Rectangle tester = new Rectangle(w, h);
        assertEquals(h * w, tester.computeArea(), 0.0001);

        float new_h = (float) 4.0;
        tester.SetHeight(new_h);
        assertEquals(new_h * w, tester.computeArea(), 0.0001);

        float new_w = (float) 0.5;
        tester.SetWidth(new_w);
        assertEquals(new_h * new_w, tester.computeArea(), 0.0001);

        new_h = (float) 5.6;
        new_w = (float) 2.9;
        tester.SetHeight(new_h);
        tester.SetWidth(new_w);
        assertEquals(new_h * new_w, tester.computeArea(), 0.0001);
        assertEquals(new_w, tester.GetWidth(), 0.0001);
        assertEquals(new_h, tester.GetHeight(), 0.0001);
    }

    @Test
    public void testSquare() {
        float a = (float) 1.1;
        Square tester = new Square(a);

        assertEquals(a * a, tester.computeArea(), 0.0001);

        float new_a = (float) 2.2;
        tester.SetWidth(new_a);
        assertEquals(new_a * new_a, tester.computeArea(), 0.0001);

        new_a = (float) 0.0;
        tester.SetWidth(new_a);
        assertEquals(new_a * new_a, tester.computeArea(), 0.0001);

    }

}

