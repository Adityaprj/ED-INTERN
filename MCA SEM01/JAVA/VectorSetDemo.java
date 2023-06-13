import java.util.Vector;
public class VectorSetDemo {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        v1.add(5);
        v1.add(10);
        System.out.println("element of v1="+v1);
        v1.set(0, 20);
        System.out.println("element updated"+v1);
        v1.remove(1);
        System.out.println("removed succesfully");
    }
}
