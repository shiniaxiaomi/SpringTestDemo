package annotation.beanTest;

public class Person {

    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name) {
        System.out.println("构造方法");
        this.name = name;
    }
}
