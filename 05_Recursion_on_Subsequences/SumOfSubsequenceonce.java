import java.util.ArrayList;
public class SumOfSubsequenceonce{
    public static boolean PrintSubsequence(int idx, ArrayList<Integer> arr, int[] a, int sum_cal ,int k){
        if(idx == a.length){
            // condition satisfaction
            if(sum_cal == k){
                System.out.println(arr);
                return true;
            }
            return false;
        }
        arr.add(a[idx]);
        sum_cal += a[idx];
        if(PrintSubsequence(idx + 1, arr,a,sum_cal,k))
        return true;
        
        sum_cal -= arr.get(arr.size()-1);
        arr.remove(idx);
        if(PrintSubsequence(idx + 1, arr, a, sum_cal, k))
        return true;
        return false;
    }
    
    public static void main(String[] args){
        int[] a = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        PrintSubsequence(0, list, a, 0, 2);
    }
}