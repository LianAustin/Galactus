import java.util.*;

public class numSystemMisc4 {
//I'm not quite sure how to get it to print out in the brackets, but I figured out hwo to convert its base
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a[] = new int[2];
    int numCases = scn.nextInt();
    scn.nextLine();
    for(int x=0; x <numCases; x++){
        String s[]= scn.nextLine().split(" ");
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
}
    int n = a[0];
    int destBase = a[1];
    System.out.println(getValueInBase(n, destBase));
    }
  }

  public static int getValueInBase(int n, int b) {
    int rv = 0;
    int p = 1;
    while (n > 0) {
      int dig = n % b;
      n = n / b;
      rv = rv + (dig * p);
      p = p * 10;
    }
    return rv;

  }

}