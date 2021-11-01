import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestClass {

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


}

