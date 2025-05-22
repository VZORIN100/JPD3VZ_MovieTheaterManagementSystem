public class Customer {
    private static int id;
    private String name;
    private static int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return id + ": " + name + ", Age: " + age;
    }


}
