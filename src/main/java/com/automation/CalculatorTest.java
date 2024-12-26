package com.automation;

import org.junit.jupiter.api.*;

/**
 * Unit tests for the Calculator class.
 */
@DisplayName("Calculator Unit Tests")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Test addition operation.
     */
    @Test
    @Tag("fast")
    @Tag("unit")
    @DisplayName("Test Addition")
    void testAdd() {
        Assertions.assertEquals(4, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    /**
     * Test subtraction operation.
     */
    @Test
    @Tag("fast")
    @Tag("unit")
    @DisplayName("Test Subtraction")
    void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    /**
     * Test multiplication operation.
     * This test is skipped for demonstration purposes.
     */
    @Test
    @Tag("slow")
    @Tag("integration")
    @Disabled("Skipping multiply test for demonstration purposes")
    @DisplayName("Test Multiplication")
    void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    /**
     * Test division operation, especially division by zero.
     */
    @Test
    @Tag("fast")
    @Tag("unit")
    @DisplayName("Test Division")
    void testDivide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0), "Dividing by zero should throw exception");
    }
}
