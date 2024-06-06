public class ASCIITest {
    public static void main(String[] args) {
        int[] ascii = new int[256];
        String s = "Abhishek";
        for(char ch : s.toCharArray()){
            ascii[ch]++;
        }
        System.out.println(ascii[65]);
    }
}
