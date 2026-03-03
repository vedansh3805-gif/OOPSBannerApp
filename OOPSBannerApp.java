// UC6 - OOPS Banner App using Static Helper Methods

public class OOPSBannerApp {

    // Method to generate O pattern
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method to generate P pattern
    public static String[] getP() {
        return new String[]{
                "*****  ",
                "*     *",
                "*     *",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method to generate S pattern
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Loop to print OOPS
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " +
                               O[i] + "  " +
                               P[i] + "  " +
                               S[i]);
        }
    }
}