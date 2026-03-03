// UC7 - OOPS Banner App using CharacterPatternMap (Static Inner Class)

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to initialize pattern mappings
    public static Map<Character, CharacterPatternMap> initializePatterns() {

        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "*****  ",
                "*     *",
                "*     *",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        return patternMap;
    }

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patterns = initializePatterns();

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch).getPattern();
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }
}