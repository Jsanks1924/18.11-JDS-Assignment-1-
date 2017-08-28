import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RecursiveTest {

    @Test
    public void test1() {
        RecursiveMethod j = new RecursiveMethod();
        int result1 = j.sumDigits(567);
        assertEquals(18,result1);
    }

    public void test2() {
        RecursiveMethod jon = new RecursiveMethod();
        int result2 = jon.sumDigits(123);
        assertEquals(6,result2);
    }
    public void test3() {
        RecursiveMethod jonathan = new RecursiveMethod();
        int result3 = jonathan.sumDigits(123456789);
        assertEquals(44,result3);
    }

}