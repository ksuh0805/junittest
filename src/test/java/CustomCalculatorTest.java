
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);

        assertTrue(result == 25);
        assertThat(result, is(25));
        System.out.println("result :: " + result);

        assertFalse(result == 2);
    }

    //빼기 테스트 작성
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);

        assertTrue(result == 13);
        assertThat(result, is(13));
        System.out.println("result :: " + result);

        assertFalse(result != 13);
    }

    @Test
    public void 빼기테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertFalse(result == 12);

        assertThat(result, is(13));
    }

    //곱하기 테스트 작성
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);

        System.out.println("result :: " + result);

        assertThat(result, is(45));
    }

    //나누기 테스트 작성
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);

        System.out.println("result :: " + result);

        assertTrue(result == 5);
    }

    @Test(timeout = 4000)
    public void timeInMethodTest() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test(timeout = 3000)
    public void 시간제한체크() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyIndexOutOfBoundException(){
        new ArrayList<Object>().get(0);

        ArrayList<Object> newList = new ArrayList<>();
        Object object = newList.get(0);
    }

    @Test
    public void isEmptyArray(){
        ArrayList<Object> myList = new ArrayList<>();
        assertThat(myList, is(empty()));

        assertTrue(myList.isEmpty());
    }
}