package generics;



import java.util.Arrays;

// here T should be either Number or its subclasses
public class WildCardExample<T extends Number> {
    Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size;

    public WildCardExample() {
        this.data= new Object[DEFAULT_SIZE];

    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;

    }
    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }
    public int getSize(){
        return size;
    }
    public void setData(int index,T value){
        data[index]=value;
    }
    public T getItem(int index){
        return (T)data[index];
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list3= new WildCardExample();
        for (int i = 0; i < 14; i++) {
            list3.add(i);

        }
        System.out.println(list3);
    }

    @Override
    public String toString() {
        return "CustomGenericArryaLists{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
