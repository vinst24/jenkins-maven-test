/**
 * Converts numerical scores into letter grades.
 */
package org.example;
public final class GradeConverter {

    private static final int MAX_SCORE = 100;
    private static final int MIN_SCORE = 0;
    private static final int A_MIN = 90;
    private static final int B_MIN = 80;
    private static final int C_MIN = 70;
    private static final int D_MIN = 60;

    /**
     * Converts a numerical score to a letter grade.
     *
     * @param score the score to convert
     * @return the letter grade as a String
     */
    public static String convert(final int score) {
        if (score <= MAX_SCORE && score >= A_MIN) {
            return "A";
        } else if (score < A_MIN && score >= B_MIN) {
            return "B";
        } else if (score < B_MIN && score >= C_MIN) {
            return "C";
        } else if (score < C_MIN && score >= D_MIN) {
            return "D";
        } else if (score < D_MIN && score >= MIN_SCORE) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
