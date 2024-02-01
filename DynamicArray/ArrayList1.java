package DynamicArray;

public class ArrayList1 {

    public static void main(String[] args) {

        Dyarray array=new Dyarray();
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(7);
        array.add(8);
        System.out.println(array);
        System.out.println(array.isFull());
        array.add(9);
//        System.out.println(array.isFull());
        System.out.println(array.size());
//        System.out.println(array.remove());
        System.out.println(array.get(7));
        array.set(2,99);
        System.out.println(array);
        array.remove();
    }
}
