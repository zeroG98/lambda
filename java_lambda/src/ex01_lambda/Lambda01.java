package ex01_lambda;

import java.util.concurrent.Flow;

public class Lambda01 {
    public static void main(String[] args) {
        Message message = (msg) -> {
            System.out.println("Enter Message : " + msg);
        };
        message.showMsg("Good Luck!!");

        NoParamMessage noParamMessage = () -> System.out.println("You can do it!! Go for it!!");
        noParamMessage.showMsg();
    }

    interface Message {
        void showMsg(String msg);
    }

    interface NoParamMessage {
        void showMsg();
    }
}
