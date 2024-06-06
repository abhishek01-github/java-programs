public class recursionExample {
    public static void main(String[] args) {
        String name = helper("Abhishek");
        System.out.println(name);
    }
    public static String helper(String s){
        if(s.isEmpty())
        return "";
        char ch = s.charAt(0);
        return helper(s.substring(1)) + ch;
    }
}
