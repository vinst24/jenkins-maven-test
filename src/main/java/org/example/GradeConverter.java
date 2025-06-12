package org.example;

/**
 * A utility class to convert numerical scores into letter grades.
 */
public final class GradeConverter {

    /**
     * Converts a score to a letter grade.
     *
     * @param score the numerical score to convert
     * @return the corresponding letter grade or "Invalid"
     */
    public static String convert(final int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else if (score >= 0 && score <= 59) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
