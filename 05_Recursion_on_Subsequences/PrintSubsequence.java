import java.util.ArrayList;

public class PrintSubsequence {
    public static void print_sequence(int idx, ArrayList<Integer> arr, int[] a, int size) {
        if (idx == size) {
            System.out.println(arr);
            return;
        }
        // take the number
        arr.add(a[idx]);
        print_sequence(idx + 1, arr, a, size);
        // don't take the number
        arr.remove(arr.size() - 1); // remove last added element by index
        print_sequence(idx + 1, arr, a, size);
    }

    public static void main(String args[]) {
        int[] a = {3, 1, 2};
        int size = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        print_sequence(0, list, a, size);
    }
}

// import java.util.ArrayList;

// public class PrintSubsequence{
//     public static void  print_sequence(int idx , ArrayList<Integer> arr,int[] a ,int size){
//     if(idx == size){
//         System.out.print(arr);
//         return;
//     }        
//         // take the number
//         arr.add(a[idx]);
//         print_sequence(idx+1,arr, a , size);
//         // dont take the number 
//         arr.remove(a[idx]);
//         print_sequence(idx+1, arr, a, size);
//     }
//     public static void main(String args[]){
//         int [] a = {3,1,2};
//         int size = a.length;
//         ArrayList list = new ArrayList();
//         print_sequence(0, list, a, size);
//     }
// }