package DesignPattern;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMB) {

        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageInMB);

        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());

        Instance li = aws.createServer(Instance.Capacity.large, 20480);
        li.start();
//        li.stop();

        System.out.println();
        Client google = new Client(new GoogleResourceFactory());
        Instance l2 = google.createServer(Instance.Capacity.micro, 256);
        l2.start();
        l2.stop();
    }
}
