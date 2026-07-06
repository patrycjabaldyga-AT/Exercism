import java.util.regex.Pattern;

class SqueakyClean {

    public static String string;

    static String clean(String identifier) {

        string = identifier;

        if (identifier.contains(" ") || identifier.isBlank()){
            string = identifier.replace(' ', '_');
        }

        if (string.contains("-")){
            string = updateStringToKebabCase();
        }

        if (string.matches(".*\\d.*")){
            string = leetspeekToNormalText();
        }

        if (string.contains(".") || string.contains("¡") || string.contains("!")){
            string = filterOddCharacters();
        }

    return string;

    }

    private static String updateStringToKebabCase() {
        return Pattern
                .compile("-(.)")
                .matcher(string)
                .replaceAll(matchResult -> matchResult.group(1).toUpperCase());
    }

    private static String leetspeekToNormalText() {
        return string
                .replace("4","a")
                .replace("3","e")
                .replace("0","o")
                .replace("1","l")
                .replace("7","t");
    }

    private static String filterOddCharacters() {
        return string
                .replaceAll("[^a-zA-Z0-9_\\s]", "");
    }
}
