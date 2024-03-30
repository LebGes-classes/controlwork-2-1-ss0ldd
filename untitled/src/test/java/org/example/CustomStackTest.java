package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomStackTest {
    @Test
    public void testPushAndPop() {
        CustomStack<Integer> stack = new CustomStack<>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testPeek() {
        CustomStack<String> stack = new CustomStack<>(3);

        stack.push("hello");
        stack.push("world");

        assertEquals("world", stack.peek());
        stack.pop();
        assertEquals("hello", stack.peek());
    }

    @Test
    public void testIsEmpty() {
        CustomStack<Double> stack = new CustomStack<>(2);

        assertTrue(stack.isEmpty());

        stack.push(1.5);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        CustomStack<Character> stack = new CustomStack<>(2);

        stack.push('a');
        stack.push('b');

        assertTrue(stack.isFull());
    }
}
