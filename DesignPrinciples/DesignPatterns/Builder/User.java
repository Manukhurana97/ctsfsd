package DesignPattern;

/**
 * @Builder, @Autowire annotation uses the same principle
 */

public class User {

    public String name;
    public int age;
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " \nAddress: " + address;
    }

    // instance of builder class
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // builder class
    public static class UserBuilder {

        public String name;
        public int age;
        public Address address;
        private final User user;

        UserBuilder() {
            user = new User();
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }


        public User build() {
            return this.build(name, age, address);
        }

        private User build(String name, int age, Address address) {
            user.setName(name);
            user.setAge(age);
            user.setAddress(address);
            return this.user;
        }


        public User getUser() {
            return this.user;
        }
    }
}
