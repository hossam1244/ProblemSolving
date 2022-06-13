package CrackingTheCodingInterview;

class Person {
    int x;
    int y;

    Person(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class PassByValueAndPassByRef {

    static void passByRef(Person person) {
        person.x = 232;
    }

    static void passByValue(int val) {
         val = val * 2;
    }

    public static void main(String[] args) {
        // an example of passing by reference which works only with objects
        // when you pass an object in a function you are passing the location of that object in memory not a copy of the object
        Person person = new Person(1, 2);
        passByRef(person);
        System.out.println(person.x);


        // an example of pass which works only with primitive data types
        int val = 2;
        passByValue(val);
        System.out.println(val);

    }
}
