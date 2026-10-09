package hospital.management;

public abstract class Person {

    String name;
    int age;

    Person(String name,int age){
        this.name= name;
        this.age= age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void showDetails();
}
