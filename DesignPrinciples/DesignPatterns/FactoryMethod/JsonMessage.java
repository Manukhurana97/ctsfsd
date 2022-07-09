package DesignPattern;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "{JSON: [] }";
    }
}
