import models.*;


public class Main {
    public static void main(String[] args) {

        Person gulzina = new Person();
        gulzina.setFullName("Гулзина Эржигитова");
        gulzina.setAge(21);

        Person marjan = new Person("Аймаржан Полот кызы", 22);

        System.out.println(gulzina);
        gulzina.move();
        System.out.println("<----------------------->");
        System.out.println(marjan);
        marjan.talk();

    }
}