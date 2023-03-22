package Lesson11;

public class ErrorMessage {

    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk space exceeded",
            "Array index out of range"
    };

    int howBad [] = {1, 2, 3, 4};

    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Nonexistent message code";
    }

    ErrorInfo getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new ErrorInfo(msgs[i], howBad[i]);
        else return new ErrorInfo("Nonexistent message code", 0);
    }
}
