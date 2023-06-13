import java.util.*;
public class AgeException extends Exception {
    static int age;
    public void show(int age) throws AgeException {
        this.age=age;
        System.out.println("enter your age: ");
        Scanner c=new Scanner(System.in);
        age=c.nextInt();
        if(age<18)
        throw new AgeException();
        System.out.println("eligible for voting");

}
public static void main(String[] args) {
    AgeException a=new AgeException();
    try {
        a.show(18);
    } catch (AgeException e) {
        System.out.println("you are not eligible for voting");
    }
}
}