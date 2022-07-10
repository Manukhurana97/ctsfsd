package DesignPattern;

public class GoogleComputeStorage implements Storage {

    public GoogleComputeStorage(int capacityInMB) {
        System.out.println("Allocated " + capacityInMB + "on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "GCP Storage";
    }

    @Override
    public String toString() {
        return "GoogleComputeStorage{}";
    }
}
