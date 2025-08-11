public class printlinearly1toN{
    public static void Print1toN(int idx, int count){ // my approach 
        if(count < 0) return;
        System.out.print(idx + " ");
        Print1toN(idx+1, count-1);
    }
    public static void print1toN(int i , int c){ // striver approach 
        if(i>c) return;
        System.out.print(i + " ");
        print1toN(i+1, c);
    }
    public static void main(String[] args) {
        // Print1toN(0,5);
        print1toN(0, 4);
    }
}