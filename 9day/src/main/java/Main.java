
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String A=sc.next();
      /* Enter your code here. Print output to STDOUT. */

      System.out.print(palindrome(A));



    }
  public static String palindrome(String A)
  {
    int middle=A.length()%2==0?A.length()/2:A.length()/2+1;

    for(int i=0;i<middle;i++)
      if(A.charAt(i)==A.charAt(A.length()-i-1))
        continue;
      else
      {return "No";}

    return "Yes";
  }
}


