import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cat2
  {

    static void validate(String x, String y)
      {
        if(x.length() != 9)
        {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        if(y.length() != 10)
        {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }

        String pattern = "^[6|7|8|9]{1}\\d{9}";
        Pattern a = Pattern.compile(pattern);
        Matcher m1 = a.matcher(y);
        if(!m1.find()){
            throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }

        String pattern2 = "^[1-9]{2}[A-Z]{3}[0-9]{4}$";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(x);
        if(!m2.find()){
            throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets");
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the registration number");
        String reg = sc.nextLine();
        System.out.println("enter the phone number");
        String no = sc.nextLine();
        sc.close();
        validate(reg, no);
        System.out.println("Valid");
    }
}