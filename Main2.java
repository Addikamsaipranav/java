import java.util.Scanner;
public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String s1 = sc.nextLine();
    
    if(s1.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")){
      System.out.println("Valid number format");
    }else{
      System.out.println("Invalid number format");
    }
  }
}