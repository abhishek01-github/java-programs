public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev1(0 ,1234));
    }
    static int rev1(int n, int num){
        if(num == 0) return n/10;
        n = (n + (num%10))*10;
        return rev1(n ,num/10);
    }
}
