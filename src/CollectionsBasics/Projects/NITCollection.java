package CollectionsBasics.Projects;

public class NITCollection {

    @Override
    public String toString() {
        if (elementCount == 0)
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size(); i++) {
            sb.append(elementData[i]);
            sb.append(", ");
        }
        int start = sb.lastIndexOf(", ");
        int end = start + 2;
        sb.delete(start, end);
        sb.append("]");
        return sb.toString();
    }

    Object[] elementData;
    int elementCount;

    public NITCollection() {
        elementData = new Object[10];
        elementCount = 0;
    }

    public int size() {
        return elementCount;

    }

    public int capacity() {
        return elementData.length;
    }

    public void add(Object obj) {
        if (size() == capacity()) {
            grow();
        }
        this.elementData[elementCount] = obj;//obj ->arg
        elementCount++;
    }

    private void grow() {
        Object[] newArray = new Object[capacity() * 2];

        for (int i = 0; i < elementData.length; i++) {
            newArray[i] = elementData[i];
        }
        elementData = newArray;
    }

    public Boolean contains(Object obj) {
        return indexOf(obj) >= 0; //calls index of method with our
        // args checks if it is greater than -1 if it then it is present in our array;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < elementData.length; i++) {
                if (obj == elementData[i]) {
                    return i;
                }
            }
        } else {

            for (int i = 0; i < elementData.length; i++) {
                if (obj.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Object get(int index) {

        if (index >= 0 || index <= elementData.length)
            return elementData[index];
        throw new IndexOutOfBoundsException(index);
    }
    public Object remove(int index){
        Object obj = null;//important
        if (index >= 0 || index <= elementData.length){
            obj = elementData[index];
        }
        for( ;index<elementCount-1; index++) {			//3. removing the given index object
            elementData[index] = elementData[index+1];
        }
        elementData[elementCount-1] = null;				//4. removing last location object reference
        elementCount--;									//5. decreasing size
        return obj;
    }

    public boolean remove(Object obj) {
        int index = indexOf(obj);//to get index, of obj

        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }
}
