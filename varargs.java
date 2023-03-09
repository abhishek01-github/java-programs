public class varargs {
    static void fun(int a, String ...v){
        System.out.println(a);
        for(int i=0; i<v.length;i++){
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        fun(2, "Abhi", "Shek", "Pan", "Dey");
    }
}