package Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(isFull()){
            int[] temp=new int[stack.length*2];
            for (int i = 0; i < stack.length; i++) {
                temp[i]=stack[i];
            }
            stack=temp;
        }
        super.push(item);
        return true;
    }
}
