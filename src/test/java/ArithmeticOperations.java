import org.junit.jupiter.api.Test;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c = 7.0;

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println((a-b)*(a+b));
        System.out.println(a/b);

        System.out.println(c/b);
        System.out.println(c-a);
        System.out.println(c-(a*b));

        System.out.println(c<b);
        System.out.println(c>a);
        System.out.println(c==(a*b));
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(++a);

        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); // 4.9E-324

        System.out.println(Float.MAX_VALUE*a);
        System.out.println(Double.MIN_VALUE/c);





    }
}
