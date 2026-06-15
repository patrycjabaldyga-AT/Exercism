public class LogLevels {
    
    public static String message(String logLine) {
        int indexOfColon = logLine.indexOf(":");
        String error = logLine.substring(indexOfColon + 1).trim();
        return error;
    }

    public static String logLevel(String logLine) {
        int indexOfFirstBracket = logLine.indexOf("[");
        int indexOfLastBracket = logLine.indexOf("]");
        String message = logLine.substring(indexOfFirstBracket + 1,indexOfLastBracket);
        return message.toLowerCase();
    }

    public static String reformat(String logLine) {

        String result = message(logLine).concat(" (" + (logLevel(logLine)) + ")" );
        return result;
    }
}
