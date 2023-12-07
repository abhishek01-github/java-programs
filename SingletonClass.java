class Singleton{
    private Singleton(){

    }
    
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
public class SingletonClass {
    public static void main(String[] args) {
        Singleton s;  
        s = Singleton.getInstance();
        Singleton s2;
        s2 = Singleton.getInstance();
        System.out.println(s==s2);  
        System.out.println(s.equals(s2));
    }
}
