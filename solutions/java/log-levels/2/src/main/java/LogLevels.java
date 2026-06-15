public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfColon = logLine.indexOf(":");
        String message = logLine.substring(indexOfColon + 1).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        int indexOfFirstBracket = logLine.indexOf("[");
        int indexOfLastBracket = logLine.indexOf("]");
        String messageE = logLine.substring(indexOfFirstBracket + 1,indexOfLastBracket);
        return messageE.toLowerCase();
    }

    public static String reformat(String logLine) {
        //grabbing [info] without spaces lowercased.
        int indexOfFirstFirst = logLine.indexOf("[");
        int indexOfLastElement = logLine.indexOf("]");
        String firstWord = logLine.substring(indexOfFirstFirst + 1,indexOfLastElement).trim().toLowerCase();

        //Getting second part of the string 'Operation completed'
        int firstLetterOfOperation = logLine.indexOf(":");
        String operationCompleted = logLine.substring(firstLetterOfOperation + 1).trim();

        //concat > combine both substrings and move one string to the end of other.
        String solution = operationCompleted.concat(" (" + firstWord + ")");
        return solution;
    }
}
