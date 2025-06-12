package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for GradeConverter.
 */
public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    /** Test for score 100. */
    @Test
    public void testConvert100() {
        assertEquals("A", GradeConverter.convert(100));
    }

    /** Test for score 90. */
    @Test
    public void testConvert90() {
        assertEquals("A", GradeConverter.convert(90));
    }

    /** Test for score 80. */
    @Test
    public void testConvert80() {
        assertEquals("B", GradeConverter.convert(80));
    }

    /** Test for score 70. */
    @Test
    public void testConvert70() {
        assertEquals("C", GradeConverter.convert(70));
    }

    /** Test for score 60. */
    @Test
    public void testConvert60() {
        assertEquals("D", GradeConverter.convert(60));
    }

    /** Test for score 50. */
    @Test
    public void testConvert50() {
        assertEquals("E", GradeConverter.convert(50));
    }

    /** Test for score above 100. */
    @Test
    public void testConvertInvalidHigh() {
        assertEquals("Invalid", GradeConverter.convert(101));
    }

    /** Test for negative score. */
    @Test
    public void testConvertInvalidLow() {
        assertEquals("Invalid", GradeConverter.convert(-10));
    }
}
