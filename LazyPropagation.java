import java.util.*;
public class LazyPropagation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = sc.readArray(n);
        int[] seg = new int[n*4];
        int[] lazy = new int[n*4];

        build(0,0,n-1,seg,a);

        int q = sc.nextInt();
        while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int value = sc.nextInt();

            rangeUpdate(0,0,n-1,l,r,value,seg,lazy);
            System.out.println(querySumLazy(0,0,n-1,l,r,seg,lazy));
        }
    }

    static void build(int index,int low,int high,int[] seg,int[] a){
        if(low==high){
            seg[index] = a[low];
            return;
        }
        int mid = low + (high-low)/2;
        build(2*index+1,low,mid,seg,a);
        build(2*index+2,mid+1,high,seg,a);

        seg[index] = seg[2*index+1]+seg[2*index+2];
    }

    static void rangeUpdate(int index, int low, int high, int l, int r, int val, int[] seg, int[] lazy) {
        if (lazy[index] != 0) {
            seg[index] += (high - low + 1) * lazy[index];
            if (low != high) {
                lazy[2 * index + 1] += lazy[index];
                lazy[2 * index + 2] += lazy[index];
            }
            lazy[index] = 0;
        }
        if ((r < low || l > high) || low>high)
            return;
        if (l <= low && r >= high) {
            seg[index] += (high - low + 1) * val;
            if (low != high) {
                lazy[2 * index + 1] += val;
                lazy[2 * index + 2] += val;
            }
            return;
        }
        int mid = low + (high - low) / 2;
        rangeUpdate(2 * index + 1, low, mid, l, r, val, seg, lazy);
        rangeUpdate(2 * index + 2, mid + 1, high, l, r, val, seg, lazy);
        seg[index] = seg[2 * index + 1] + seg[2 * index + 2];
    }

    static int querySumLazy(int index, int low, int high, int l, int r, int[] seg, int[] lazy){
        if(lazy[index]!=0){
            seg[index] += (high-low+1)*lazy[index];
            if(low!=high){
                lazy[2*index+1] += lazy[index];
                lazy[2*index+2] += lazy[index];
            }
            lazy[index] = 0;
        }
        if((r<low || l>high) || low>high)
            return 0;
        if(l<=low && r>=high)
            return seg[index];
        int mid = low + (high-low)/2;
        return querySumLazy(2*index+1,low,mid,l,r,seg,lazy)+querySumLazy(2*index+2,mid+1,high,l,r,seg,lazy);
    }

    static int[] readArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}