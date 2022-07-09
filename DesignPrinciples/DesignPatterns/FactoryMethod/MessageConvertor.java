package DesignPattern;

public abstract class MessageConvertor {
    public Message getMessage(){
        Message message = createMessage();

        message.addDefaultMethod();
        message.addDefaultMethod();

        return message;
    }

    public abstract Message createMessage();
}
