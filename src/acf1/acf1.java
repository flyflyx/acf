package acf1;

/**
 * Created by admin on 10.02.2017.
 */
public class acf1 {
    public static void main(String[] args) {
        MyHashTable t = new MyHashTable(100);
        t.put("table","стол");
        String r=t.get("table");
        System.out.println(r);
    }
}
