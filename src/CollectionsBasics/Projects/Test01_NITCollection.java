package CollectionsBasics.Projects;

public class Test01_NITCollection {
    static void main() {
        NITCollection col = new NITCollection();

        System.out.println("capacity: " + col.capacity());
        System.out.println("size    : " + col.size());
        System.out.println("eles    : " + col);
        System.out.println();

        col.add("a");
        col.add("b");
        col.add(5);
        col.add(6.7);
        col.add('p');
        col.add(true);
        col.add(null);
        col.add("a");
        col.add('b');
        col.add(null);
        col.add(5);

        System.out.println("capacity: " + col.capacity());
        System.out.println("size    : " + col.size());
        System.out.println("eles    : " + col);
        System.out.println("===============");

        col.add(6.7);
        col.add(new Ex(5, 6));
        col.add(new Sa(5, 6));

        System.out.println("capacity: " + col.capacity());
        System.out.println("size    : " + col.size());
        System.out.println("eles    : " + col);
        System.out.println("===============");

        System.out.println(col.contains("a")); //"a".equals(elementData[i]);
        System.out.println(col.contains(5));   //I(5).equals(elementData[i]);
        System.out.println(col.contains(9));   //I(9).equals(elementData[i]);

        System.out.println(col.contains(new String("a")));  //new S("a").equals(elementData[i]);
        System.out.println(col.contains(new Integer(5)));   //new I(5).equals(elementData[i]);

        System.out.println(col.contains(new Ex(5, 6)));   	//new Ex(5,6).equals(elementData[i]);
        System.out.println(col.contains(new Sa(5, 6)));   	//new Ex(5,6).equals(elementData[i]);

        System.out.println(col.contains(null)); 			//null==ele; -> true
        System.out.println("================");


        System.out.println(col.indexOf("a")); 	//0
        System.out.println(col.indexOf(5)); 	//2
        System.out.println(col.indexOf(9)); 	//-1
        System.out.println("================");


        Object obj;
        //Rule: [index>=0 && index<length]
        obj = col.get(0); System.out.println(obj);
        obj = col.get(2); System.out.println(obj);	//retrieving randomly
        obj = col.get(6); System.out.println(obj);
        obj = col.get(11); System.out.println(obj);
        obj = col.get(12); System.out.println(obj);
        obj = col.get(13); System.out.println(obj);

        for(int i=0;i< col.size();i++){

            obj = col.get(i);
            System.out.println(obj);
        }
        System.out.println("================");
        col = new NITCollection();
        col.add("a");
        col.add("b");
        col.add(5);
        col.add(6.7);
        col.add('p');
        col.add(true);
        col.add(null);
        col.add("a");
        col.add(new Ex(5,6));
        col.add(new Sa(5,6));

        System.out.println("capacity: " + col.capacity());
        System.out.println("size    : " + col.size());
        System.out.println(col);
        System.out.println();

        col.remove(0);				//0 index object is removed, eq() is not called
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove(3);				//3rd index object is removed, eq() is not called
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove(true);			//true.equals(elementData[i]);
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove(new Ex(5,6));	//new Ex(5,6).equals(elementData[i])
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove(new Sa(5,6));	//new Sa(5,6).equals(elementData[i])
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove(5);				//here Integer obj 5 is not removed, 5th index object is removed
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        col.remove((Integer)5);		//now Integer obj 5 is removed
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
        System.out.println();

        //col.remove(-1);		//RE: IOOBE
        //col.remove(4);		//RE: IOOBE
        //col.remove(7);		//RE: IOOBE

        col.remove("B");	//"B" is not found, just returns false
        System.out.println(col);
        System.out.println("size    : " + col.size());
        System.out.println("capacity: " + col.capacity());
    }
}
