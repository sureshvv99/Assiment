package Assement;

public class printnumbers {
public static void printnumb (int num) {

        if (num <= 100)
        {
            System.out.println(num+" ");
        printnumb(num+1);
    }
}
    public static void main(String[] args) {
        int n = 1;
        printnumb(n);

    }}

