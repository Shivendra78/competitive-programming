package module2;

import java.io.Serializable;

class StudentBean implements Serializable {

    private String name;
    private int age;

    // No-arg constructor
    public StudentBean() {}

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TestBean {
    public static void main(String[] args) {

        StudentBean s = new StudentBean();

        s.setName("Shivam");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}