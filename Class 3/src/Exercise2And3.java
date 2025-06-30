import java.util.Scanner;

public class Exercise2And3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Animal animal= new Dog("Angry",10,"pinsher");//It's a example de upcasting

        if(animal instanceof  Dog){
            Dog dog= (Dog)animal;//It's a example de downcasting
            dog.bark();
        }

        scanner.close();
    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name= name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    void bark(){//The name bark in portuguese is "latir"
        System.out.println("Woof! Woof!");
    }
}
/*class cats extends Animal{
    private String breed;
    public dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    void bark(){//The name bark in portuguese is "latir"
        System.out.println("Woof! Woof!");
    }
}*/
