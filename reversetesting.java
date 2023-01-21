package Assement;

public class reversetesting {
    public static void main(String[] args) {
        String str = "repaper";
        String reversedStr = "repaper";
        StringBuffer br = new StringBuffer(str);
        System.out.println("reverse of given string:"+reversedStr);
        br.reverse();
        String data = br.toString();
        if (str.equals(data))
        {
            System.out.println("The Input String is a Palindrome");
        } else {
            System.out.println("The Input String is not a Palindrome");
        }

    }
}



