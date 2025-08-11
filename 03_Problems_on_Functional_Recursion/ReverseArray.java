

public class ReverseArray{
    // public static void ReverseArrayList(int a[],int left,int right){
    // if(left>right) return;
    // swap(a[left],a[right]);  
    // ReverseArrayList(a, left+1, right-1);
    // } one way
public static void ReverseArray(int i, int a[], int n){
    if(i >= n/2){ 
        for(int idx = 0 ; idx < n ; idx++){
            System.out.print(a[idx] + " ");
        }
        return;
    }
    
    int temp = a[i];
    a[i] = a[n-i-1];
    a[n-i-1] = temp;
    ReverseArray(i+1, a, n);
}
    public static void main(String args[]){
        int arr[] = {1,5,6,9,1};
        ReverseArray(0, arr, arr.length);
    }
}