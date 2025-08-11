import java.util.Scanner;
public class print1toNusingbacktrack{
    public static void print1toN(int i , int n){
        if(i<1) return;
        print1toN(i-1,n);
        System.out.print(i + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        sc.close();
        print1toN(n,n);
    }
}