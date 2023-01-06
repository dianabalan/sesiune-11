package example_final;

public class Person {

    private final String cnp;
    private String name;

    public Person(String name, String cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    public final void method1(){
        System.out.println("This is method1");

        System.out.println(MyClass.DAY_IN_WEEK);

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;

        return cnp.equals(person.cnp);
    }


    //    @Override
//    public boolean equals(Object o){
//      Person person = (Person) o;
//
//      return this.cnp.equals(person.cnp);
//    }
}
