import org.junit.*;
import static org.junit.Assert.*;

public class JUnitTest {
    @Test
    public void test_findMax() {
        Finder find = new Finder();
        int[] i = new int[]{1,1,2,3,5,8,13,21,34,55,89};
        int maxInArray = find.findMax(i);
        //test
        assertEquals(maxInArray,89);

    }

    @Test
    public void test_findMin() {
        Finder find = new Finder();
        int[] i = new int[]{1,1,2,3,5,8,13,21,34,55,89};
        int minInArray = find.findMin(i);
        //test
        assertEquals(minInArray,1);
    }



    @Test(expected = NullPointerException.class)
    public void test_findMaxinNullArray() {
        Finder find = new Finder();
        int[] i = null;
        int arrayi = find.findMax(null);
        Assert.assertNull(arrayi);
    }

    @Test(expected = NullPointerException.class)
    public void test_findMaxinEmptyArray() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int arrayj = find.findMax(j);
        Assert.assertNull(arrayj);
    }

    @Test(expected = NullPointerException.class)
    public void test_findMininNullArray() {
        Finder find = new Finder();
        int[] i = null;
        int arrayi = find.findMin(i);
        Assert.assertNull(arrayi);
    }

    @Test(expected = NullPointerException.class)
    public void test_findMininEmptyArray() {
        Finder find = new Finder();
        int[] j = new int[]{};
        int arrayj = find.findMin(j);
        Assert.assertNull(arrayj);
    }

}
