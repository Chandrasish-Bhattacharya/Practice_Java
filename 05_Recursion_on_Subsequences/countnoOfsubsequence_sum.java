import java.util.ArrayList;
public class countnoOfsubsequence_sum{
    public static int PrintSubsequence(int idx, ArrayList<Integer> arr, int[] a, int sum_cal ,int k){
        if(idx == a.length){
            // condition satisfaction
            if(sum_cal == k){
                return 1;
            }
            return 0;
        }
        arr.add(a[idx]);
        sum_cal += a[idx];
        int l = PrintSubsequence(idx + 1, arr,a,sum_cal,k);
        
        sum_cal -= arr.get(arr.size() - 1);
        arr.remove(arr.size()-1);
        int r = PrintSubsequence(idx + 1, arr, a, sum_cal, k);

        return l+r;
    }
    
    public static void main(String[] args){
        int[] a = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(PrintSubsequence(0, list, a, 0, 2));
    }
}