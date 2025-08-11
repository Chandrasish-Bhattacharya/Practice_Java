public class printNto1{
    public static void Nto1(int count)
{
    if(count == 0) return;
    System.out.print(count + " ");
    Nto1(count-1);
}    public static void main(String[] args) {
        Nto1(6);
    }
}