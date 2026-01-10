import java.util.Scanner;

public class Main { 
  static int climb(int n){
        if(n<=1) return 1;
        return climb(n-1) +climb(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(climb(n));
    }
}