import java.util.*;
public class evenOdd {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Number:");
    int i = in.nextInt();

    if ((i & 1) == 0) {
        System.out.println("Even");
      }
      else{
        System.out.println("Odd");
      }
    }
}
