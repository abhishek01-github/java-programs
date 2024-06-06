import java.util.*;

class GroupFormation {
    public int minGroups(int[][] persons) {
        Set<String> grid = new HashSet<>();
        for (int[] person : persons) {
            grid.add(person[0] + "," + person[1]);
        }

        int groups = 0;
        Set<String> visited = new HashSet<>();
        for (int[] person : persons) {
            int x = person[0];
            int y = person[1];
            String pos = x + "," + y;
            if (!visited.contains(pos)) {
                dfs(grid, x, y, visited);
                groups++;
            }
        }

        return groups;
    }

    // Depth First Search to visit all connected persons
    private void dfs(Set<String> grid, int x, int y, Set<String> visited) {
        if (x < 0 || y < 0 || !grid.contains(x + "," + y) || visited.contains(x + "," + y)) return;
        
        visited.add(x + "," + y);
        dfs(grid, x + 1, y, visited);
        dfs(grid, x - 1, y, visited);
        dfs(grid, x, y + 1, visited);
        dfs(grid, x, y - 1, visited);
    }
}

public class minG {
    public static void main(String[] args) {
        int[][] persons = {{2, 1}, {2, 4}, {3, 3}, {4, 2}};
        GroupFormation groupFormation = new GroupFormation();
        int minGroups = groupFormation.minGroups(persons);
        System.out.println("Minimum number of groups: " + minGroups);
    }
}
