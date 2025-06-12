import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the GradeConverter class.
 */
public class GradeConverterTest {

    private GradeConverter converter;

    /**
     * Sets up the test environment.
     *
     * @throws Exception if setup fails
     */
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    /**
     * Tests conversion for score 100.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert1() throws Exception {
        final String expected = "A";
        final String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score 90.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert2() throws Exception {
        final String expected = "A";
        final String actual = converter.convert(90);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score 80.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert3() throws Exception {
        final String expected = "B";
        final String actual = converter.convert(80);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score 70.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert4() throws Exception {
        final String expected = "C";
        final String actual = converter.convert(70);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score 60.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert5() throws Exception {
        final String expected = "D";
        final String actual = converter.convert(60);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score 50.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert6() throws Exception {
        final String expected = "E";
        final String actual = converter.convert(50);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score above 100.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert7() throws Exception {
        final String expected = "Invalid";
        final String actual = converter.convert(101);
        assertEquals(expected, actual);
    }

    /**
     * Tests conversion for score below 0.
     *
     * @throws Exception if test fails
     */
    @Test
    public void testConvert8() throws Exception {
        final String expected = "Invalid";
        final String actual = converter.convert(-10);
        assertEquals(expected, actual);
    }
}
