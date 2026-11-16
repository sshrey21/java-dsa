package String;

public class Palindrome {
    public static boolean palindrome(String str) {
        int l=0, h=str.length()-1;
        while(l<h)
        {
            if(str.charAt(l)==str.charAt(h))
            {
                l++;
                h--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="racwecar";
        System.out.println(palindrome(str));

    }
}
