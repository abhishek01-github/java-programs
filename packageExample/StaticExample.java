package packageExample;

public class StaticExample {
    public static void main(String[] args) {
        Human abhishek = new Human(24, "Abhishek");
        Human naina = new Human(21, "Naina");
        System.out.println(Human.population);
        System.out.println(naina.eyes);
        System.out.println(abhishek.age);
    }
}
