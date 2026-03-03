// UC8 - OOPS Banner App using HashMap and Render Function

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Store all character patterns in a Map
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "*****  ",
                "*     *",
                "*     *",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patterns;
    }

    // Render banner using map lookup
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = initializePatterns();

        renderBanner("OOPS", patterns);
    }
}