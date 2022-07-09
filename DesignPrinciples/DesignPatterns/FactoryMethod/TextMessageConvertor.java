package DesignPattern;

public class TextMessageConvertor extends MessageConvertor{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
