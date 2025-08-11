import java.util.Scanner;
public class factorial{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        int sol = n * fact(n-1);
        return sol;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Sum is : " + fact(n));
    }
}