package persons;

import java.awt.*;

public class Person {
    private String name;
    private int age;
    private String address;

    public void introduce() {
        System.out.printf("My name is %s, I am %d years old and I live in %s.\n", name, age, address );
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


