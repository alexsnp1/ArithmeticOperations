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

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Float.MAX_VALUE*a);
        System.out.println(Double.MIN_VALUE/c);





    }
}
