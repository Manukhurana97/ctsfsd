package DesignPattern;

public class client {
    public static void main(String[] args) {
        printMessage(new JsonMessageConvertor());
        printMessage(new TextMessageConvertor());
    }

    public static void printMessage(MessageConvertor messageConvertor) {
        Message mgs = messageConvertor.getMessage();
        System.out.println(mgs.getContent());
    }


}
