import java.util.Scanner;
public class sumofFirstNnumbersReturn{
    public static int SumofNnumbers(int n){
        if (n==0){
            return 0;
        }
        int sum = n + SumofNnumbers(n-1);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Sum is : " + SumofNnumbers(n));
    }
}