import java.sql.SQLOutput;

public class AddTwonumber {
    public static void main(String[] args) {
        int a,b;
        a = 12;
        b = 14;
        AddTwoNumber(a,b);

    }

    public static void AddTwoNumber(int num1, int num2) {
        int ans;
        ans = num1 + num2;
        System.out.println("the ans is " + ans);
    }
}
