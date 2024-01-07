    package edu.estu;

    import org.junit.Test;

    import static org.junit.Assert.fail;

    public class FailingTest {

        @Test
        public void testInfiniteLoop() {
        // You should call the infiniteLoop method with input that causes an infinite loop
        // For example, pass Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY
        // This test should fail due to the intentional bug in the infiniteLoop method.
        App.infiniteLoop(Double.POSITIVE_INFINITY); // Change input accordingly
        System.out.println("The infinite loop bug was not triggered");
    }
    }


