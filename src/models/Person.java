//asd

package models;

public class Person {

    private String fullName;
    private int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void move() {
        System.out.println(fullName + " �����!");
    }

    public void talk() {
        System.out.println(fullName + " �������!");
    }

    @Override
    public String toString() {
        return "���: " + fullName +
                "\n��������: " + age;
    }

}
