import java.util.*;
public class BacktrackingMaze {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        boolean[][] obstacles = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int count = solve("", obstacles, 0, 0, 0, maze);
        System.out.println("These are the total " + count + " possible paths");
    }
    static int solve(String p,boolean[][] obstacles,int r, int c,int count,int[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            obstacles[r][c]=false;
            maze[r][c]=1;
            display(maze);
            System.out.println();
            obstacles[r][c]=true;
            count++;
            return count;
        }
        if(!obstacles[r][c]){
            return count;
        }
        obstacles[r][c]=false;
        maze[r][c]=1;
        if(r>0){
            count=solve(p+"U", obstacles, r-1, c, count, maze);
        }
        if(r<maze.length-1){
            count=solve(p+"D", obstacles, r+1, c, count, maze);
        }
        if(c>0){
            count=solve(p+"L", obstacles, r, c-1, count, maze);
        }
        if(c<maze[0].length-1){
            count=solve(p+"R", obstacles, r, c+1, count, maze);
        }
        obstacles[r][c]=true;
        maze[r][c]=0;
        return count;
    }
    static void display(int[][] maze){
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] +" ");
            }
            System.out.println();
        }
    }
}
