package CollectionsBasics;

public class MainGrowable {
    static void main() {
        GrowableArray col = new GrowableArray();
        System.out.println("capacity: "+col.capacity());
        System.out.println("size: "+col.size());
        System.out.println("ele: "+col);


        col.add("a");
        col.add(12);
        col.add("a");
        col.add("b");
        col.add('c');
        col.add(5);
        col.add(true);
        col.add(null);
        col.add(6.7);
        col.add(null);
        col.add(null);
        col.add(6.7);

        System.out.println();

        System.out.println("capacity: " + col.capacity());
        System.out.println("size: " + col.size());
        System.out.println("ele: " + col);


        System.out.println(col.contains("a"));//
        System.out.println(col.contains(5));//
        System.out.println(col.contains(9));
        System.out.println(col.contains(new String("a")));

    }
}
