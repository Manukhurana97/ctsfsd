package DesignPattern;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMB) {
        System.out.println("Allocated " + capacityInMB + " on s3");
    }

    @Override
    public String getId() {
        return "SD id";
    }

    @Override
    public String toString() {
        return "S3Storage{}";
    }
}
