public class names5times{
    public static void printName(String name,int count){
        if(count == 0) return;
        System.out.println("Name :" + name);
        printName(name,count-1);
    }
    public static void main(String args[]){
        printName("Chandrasish Bhattacharya" , 5);
    }
}