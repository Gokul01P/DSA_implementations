package Recursion.Simple_Programs;

public class Add_N_No {
    public static void main(String[] args) {
        int a=5;
        System.out.println(sum(a));
    }
    static int sum(int a){
        if(a==1)
            return a;
        return a+sum(a-1);
    }
}
