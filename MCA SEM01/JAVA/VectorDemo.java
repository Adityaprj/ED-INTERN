import java.util.Vector;
public class VectorDemo
{
    public static void main(String[] args) {
        Vector<Integer>v1=new Vector<>();
        v1.add(5);
        v1.add(10);
        v1.add(2, 15);
        System.out.println("element of v1="+v1);
        Vector<Integer> v2=new Vector<>();
        v2.add(8);
        v2.add(25);
        v1.addAll(v2);
        System.out.println(v2);
        System.out.println(v1);
        System.out.println(v2.get(1));
    }
}