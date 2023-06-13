import java.util.Scanner;
public class A9 {
    
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter breadth");
        int b=sc.nextInt();
        if(l==b){
            System.out.println("it is square");
        }
        else{
            System.out.println("not square");
        }
    }
}