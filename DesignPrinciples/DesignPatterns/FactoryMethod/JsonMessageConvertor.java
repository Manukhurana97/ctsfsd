package DesignPattern;

public class JsonMessageConvertor extends MessageConvertor{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
