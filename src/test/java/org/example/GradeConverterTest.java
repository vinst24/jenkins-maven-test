package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for GradeConverter class.
 */
public class GradeConverterTest {

    /** GradeConverter instance for testing. */
    private GradeConverter converter;

    /**
     * Setup before each test.
     */
    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    //Diem toi da A
    private static final int SCORE_A_MAX = 100;
    //Diem toi thieu A
    private static final int SCORE_A_MIN = 90;
    //Diem toi thieu B
    private static final int SCORE_B_MIN = 80;
    //Diem toi thieu C
    private static final int SCORE_C_MIN = 70;
    //Diem toi thieu D
    private static final int SCORE_D_MIN = 60;
    //Diem toi thieu E
    private static final int SCORE_E_MIN = 0;
    //Diem khong hop le tren high
    private static final int SCORE_INVALID_HIGH = 101;
    //Diem khong hop le duoi low
    private static final int SCORE_INVALID_LOW = -10;
    //Diem cua E
    private static final int SCORE_E_VALUE = 50;

    /** Test conversion of score 100 to grade A. */
    @Test
    public void testConvert100() {
        assertEquals("A", GradeConverter.convert(SCORE_A_MAX));
    }

    /** Test conversion of score 90 to grade A. */
    @Test
    public void testConvert90() {
        assertEquals("A", GradeConverter.convert(SCORE_A_MIN));
    }

    /** Test conversion of score 80 to grade B. */
    @Test
    public void testConvert80() {
        assertEquals("B", GradeConverter.convert(SCORE_B_MIN));
    }

    /** Test conversion of score 70 to grade C. */
    @Test
    public void testConvert70() {
        assertEquals("C", GradeConverter.convert(SCORE_C_MIN));
    }

    /** Test conversion of score 60 to grade D. */
    @Test
    public void testConvert60() {
        assertEquals("D", GradeConverter.convert(SCORE_D_MIN));
    }

    /** Test conversion of score 50 to grade E. */
    @Test
    public void testConvert50() {
        assertEquals("E", GradeConverter.convert(SCORE_E_VALUE));
    }

    /** Test conversion of invalid high score (101). */
    @Test
    public void testConvertInvalidHigh() {
        assertEquals("Invalid", GradeConverter.convert(SCORE_INVALID_HIGH));
    }

    /** Test conversion of invalid low score (-10). */
    @Test
    public void testConvertInvalidLow() {
        assertEquals("Invalid", GradeConverter.convert(SCORE_INVALID_LOW));
    }
}
