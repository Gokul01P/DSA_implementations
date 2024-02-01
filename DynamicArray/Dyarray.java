package DynamicArray;
import java.util.Arrays;
public class Dyarray {
    static int cap = 1;
    static int size=0;
    int[] array;
    public Dyarray(){
        array=new int[cap];
    }
    public void add(int ele){
        if(isFull()){
            resize();
        }
        array[size++]=ele;
    }
    public boolean isFull(){
        return size==cap;
    }
    public void resize(){
        cap=cap*2;
        int[] temp=new int[cap];
        for (int i = 0; i < size; i++) {
            temp[i]=array[i];
        }
        array=temp;
    }
    public int remove(){
        if (isEmpty()){
            System.out.println("Array is empty");
        }
        int removeItem=array[size()-1];
        size--;
        return removeItem;
//        arr[size--]=item;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int get(int index){
        return array[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int item){
        array[index]=item;
    }
    @Override
    public String toString(){
        System.out.println("......................................");
        return "Dynamicarray : " + Arrays.toString(array) + "\nsize :" + size() + "\n......................................";
    }
}
