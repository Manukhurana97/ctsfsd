package DesignPattern;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        System.out.println("Creating instance...");
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityMib) {
        System.out.println("Allocating Storage...");
        return new S3Storage(capacityMib);
    }
}
