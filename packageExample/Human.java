package packageExample;

public class Human {
    int age;
    String name;
    final int eyes = 2;
    static int population;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        Human.population+=1;
    }
}
