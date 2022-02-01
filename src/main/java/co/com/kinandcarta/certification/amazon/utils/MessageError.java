package co.com.kinandcarta.certification.amazon.utils;

public enum MessageError {

    MSG_VALUE_BUTTON_ENABLE("Button add cart is visible"),
    MSG_VALUE_BUTTON_DISABLED("Button add cart is not visible");
    private String msg;

    private MessageError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
