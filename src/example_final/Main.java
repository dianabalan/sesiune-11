package example_final;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Diana", "29109080706923");
        Person person2 = new Person("Adi", "7676239127388973");

        Person person3 = new Person("Diana", "8237498273978");
        Person person4 = new Person("Isa", "29109080706923");


        System.out.println(person1.equals(person2));

        System.out.println(person1.equals(person3));

        System.out.println(person1.equals(person4));
    }
}
