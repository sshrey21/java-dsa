package Searching;

public class arrangingCoins {
    public static int arrange(int n)
    {
//        int k = (int)(Math.sqrt(8*n+1)-1)/2; using basic math.
//        return k;
        //using binary search
        int low =0, high =n, ans =0;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int coins = mid*(mid+1)/2;
            if(coins <= n)
            {
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 21; //number of coins to be arranged in stairs
        System.out.println(arrange(n));
    }
}
