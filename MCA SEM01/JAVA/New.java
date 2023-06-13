import java.util.Vector;
import java.util.Vector;
public class New
{
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        v1.add(6);
        System.out.println("element of v1="+v1);
        Vector<Integer> v2=new Vector<>();
        v2.add(8);
        v1.addAll(v2);
        System.out.println(v2);
        System.out.println(v1);
        System.out.println(v1.get(1));
        }
}