package String;

public class PassingStringParameter {
    public static void change(String x) {
        x="stark";
    }
    public static void main(String[] args) {
        String x="Anthony";
        System.out.println(x);
//        x="Tony";
        change(x);
        System.out.println(x);

    }
}
