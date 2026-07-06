import java.util.regex.Pattern;

class SqueakyClean {

    public static String replacedEmptySpace;

    static String clean(String identifier) {

        replacedEmptySpace = identifier;

        if (identifier.contains(" ") || identifier.isBlank()){
            replacedEmptySpace = identifier.replace(' ', '_');
        }

        if (replacedEmptySpace.contains("-")){
            replacedEmptySpace = updateStringToKebabCase();
        }

        if (replacedEmptySpace.matches(".*\\d.*")){
            replacedEmptySpace = leetspeekToNormalText();
        }

        if (replacedEmptySpace.contains(".") || replacedEmptySpace.contains("¡") || replacedEmptySpace.contains("!")){
            replacedEmptySpace = filterOddCharacters();
        }

    return replacedEmptySpace;

    }

    private static String updateStringToKebabCase() {
        return Pattern
                .compile("-(.)")
                .matcher(replacedEmptySpace)
                .replaceAll(matchResult -> matchResult.group(1).toUpperCase());
    }

    private static String leetspeekToNormalText() {
        return replacedEmptySpace
                .replace("4","a")
                .replace("3","e")
                .replace("0","o")
                .replace("1","l")
                .replace("7","t");
    }

    private static String filterOddCharacters() {
        return replacedEmptySpace
                .replaceAll("[^a-zA-Z0-9_\\s]", "");
    }
}
