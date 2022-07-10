package DesignPattern;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created Ec2 Instance with capacity type " + capacity);
    }

    @Override
    public void start() {
        // map capacity to ec2 instance types. Use aws API to provision
        System.out.println("Ec2Instance Started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + "to Ec2 Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2 Instance stop");
    }

    @Override
    public String toString() {
        return "Ec2Instance{}";
    }
}
