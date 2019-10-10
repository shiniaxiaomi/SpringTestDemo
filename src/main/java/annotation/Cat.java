package annotation;


public class Cat {

    String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
}
