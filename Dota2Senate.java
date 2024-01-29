import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }
    public static String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        for(char ch : senate.toCharArray()){
            queue.offer(ch);
        }
        int r = 0;
        int d = 0;

        while(r!=queue.size() || d!=queue.size()){
            char ch = queue.poll();
            if(ch=='R'){
                if(d>0){
                    d--;
                } else {
                    r++;
                    queue.offer(ch);
                }
            } else {
                if(r>0){
                    r--;
                } else {
                    d++;
                    queue.offer(ch);
                }
            }
        }
        if(queue.peek()=='R'){
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}
