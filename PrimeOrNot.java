public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 191;
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
