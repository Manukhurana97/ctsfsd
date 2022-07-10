package DesignPattern;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Instance " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Google Compute Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + "to Google Compute Instance");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Instance stop");
    }
}
