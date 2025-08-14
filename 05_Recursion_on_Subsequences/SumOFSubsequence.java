
import java.util.ArrayList;

public class SumOFSubsequence{
    // public static void print_sequence_with_sumasK(int idx, ArrayList arr, int[] a, int sum_cal ,int k){
    //     if(idx == a.length-1){
    //         if(sum_cal == k){
    //             System.out.println(arr);
    //         }
    //         return;
    //     }
    //     arr.add(a[idx]);
    //     sum_cal += a[idx];
    //     print_sequence_with_sumasK(idx+1, arr, a, sum_cal, k);
        
    //     // Backtrack
    //     sum_cal -= arr.get(arr.size() - 1);
    //     arr.remove(arr.size() - 1);

    //     print_sequence_with_sumasK(idx+1, arr, a, sum_cal, k);
    // }
    public static void print_sequence_with_sumasK(int idx, ArrayList<Integer> arr, int[] a, int sum_cal ,int k){
    if(idx == a.length){
        if(sum_cal == k){
            System.out.println(arr);
        }
        return;
    }

    // Include current element
    arr.add(a[idx]);
    sum_cal += a[idx];
    print_sequence_with_sumasK(idx + 1, arr, a, sum_cal, k);

    // Backtrack
    sum_cal -= arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);

    // Exclude current element
    print_sequence_with_sumasK(idx + 1, arr, a, sum_cal, k);
}

    public static void main(String[] args){
        int[] a = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        print_sequence_with_sumasK(0, list, a, 0, 2);
    }
}