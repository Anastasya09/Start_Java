package Lesson11;

public class ErrMsgDemo {
    public static void main(String[] args) {

        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(219));

        ErrorInfo e = err.getErrorInfo(2);

        System.out.println(e.msg + ". Level of severity: "
        + e.severity);
    }
}
