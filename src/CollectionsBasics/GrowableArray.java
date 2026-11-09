package CollectionsBasics;
import java.util.Arrays;
public class GrowableArray {

    private Object[] elementData;
    private int elemnTcount;

    public GrowableArray(){
            elementData = new Object[10];
            elemnTcount =0;
    }
    public void add(Object obj){
        if(size()==capacity()){
            grow();
        }

        this.elementData[elemnTcount] = obj;
        elemnTcount++;
    }

    private void grow() {
        Object [] newArray = new Object[capacity() * 2];

        for(int i=0;i<elementData.length;i++){
            newArray[i] = elementData [i];
        }
        elementData = newArray;
    }

    public int capacity(){
        return elementData.length;
    }
    public int size(){
        return elemnTcount;
    }

    @Override
    public String toString() {
        if(elemnTcount==0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<elemnTcount;i++){
            sb.append(elementData[i]);
            sb.append(", ");

        }
        int start = sb.lastIndexOf(", ");
        int end = start+2;
        sb.delete(start,end);

        sb.append("]");
        return sb.toString();
    }
    public boolean contains(Object obj){
        for(int i=0;i<elemnTcount;i++){
            Object element = elementData[i];
            System.out.println(obj + "  "+ element);
            if(obj.equals(element)){
                return true;
            }
        }
        return false;
    }
}
