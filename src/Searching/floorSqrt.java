package Searching;

public class floorSqrt {
    public static int sqrt(int n) {
//        int root = 0;
//        for(int i=1;i<=n;i++)
//        {
//            if(i*i>n) break;
//            root = i;
//        }
//        return root;
        int low = 1, high = n, ans =0;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(mid*mid > n) high = mid-1;
            else if (mid*mid<n)
            {
                ans = mid;
                low = mid+1;
            }
            else return mid;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 240;
        int ans = sqrt(n);
        System.out.println(ans);
    }
}
