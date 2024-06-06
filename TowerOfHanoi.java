class towerOfHanoi { 
    static void toh(int n, char from_rod, 
                             char to_rod, char aux_rod) 
    { 
        if (n == 0) { 
            return; 
        } 
        toh(n - 1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod "
                           + from_rod + " to rod "
                           + to_rod); 
        toh(n - 1, aux_rod, to_rod, from_rod); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 64; 
  
        // A, B and C are names of rods 
        toh(N, 'A', 'C', 'B'); 
    } 
} 