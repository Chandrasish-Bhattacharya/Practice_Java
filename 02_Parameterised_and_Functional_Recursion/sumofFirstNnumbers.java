
import java.util.Scanner;
// this is the Parameterised 
public class sumofFirstNnumbers{
    public static void SumofNnumbers(int n,int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        } 
        SumofNnumbers(n-1,sum+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();
        SumofNnumbers(n,0);
    }
}