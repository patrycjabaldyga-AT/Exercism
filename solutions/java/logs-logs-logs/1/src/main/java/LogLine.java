public class LogLine {

    String logline;

    public LogLine(String logLine) {
        this.logline = logLine;
    }

    public LogLevel getLogLevel() {

        if (logline.contains("TRC")) {
            return LogLevel.TRACE;
        }

        if (logline.contains("DBG")) {
            return LogLevel.DEBUG;
        }

        if (logline.contains("INF")) {
            return LogLevel.INFO;
        }

        if (logline.contains("WRN")) {
            return LogLevel.WARNING;
        }

        if (logline.contains("ERR")) {
            return LogLevel.ERROR;
        }

        if (logline.contains("FTL")) {
            return LogLevel.FATAL;
        }

        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {

        String substringOfCode = logline.substring(0, 7);
        String format;

        if (logline.contains("TRC")) {
            format = Integer.toString(LogLevel.TRACE.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }

        if (logline.contains("DBG")) {
            format = Integer.toString(LogLevel.DEBUG.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }

        if (logline.contains("INF")) {
            format = Integer.toString(LogLevel.INFO.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }

        if (logline.contains("WRN")) {
            format = Integer.toString(LogLevel.WARNING.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }

        if (logline.contains("ERR")) {
            format = Integer.toString(LogLevel.ERROR.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }

        if (logline.contains("FTL")) {
            format = Integer.toString(LogLevel.FATAL.getShortFormat()).concat(":");
            return logline.replace(substringOfCode, format);
        }


        format = Integer.toString(LogLevel.UNKNOWN.getShortFormat()).concat(":");
        return logline.replace(substringOfCode, format);

    }
}
