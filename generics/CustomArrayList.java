package generics;

import java.util.Arrays;

public class CustomArrayList {
    int[] data;
    private static int DEFAULT_SIZE=10;
    private int size;

    public CustomArrayList() {
        this.data= new int[DEFAULT_SIZE];

    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;

    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int getSize(){
        return size;
    }
    public void setData(int index,int value){
        data[index]=value;
    }
    public int getItem(int index){
        return data[index];
    }
    @Override
    public String toString() {
        return "CustomArrayList{"+ Arrays.toString(data)+","+size;
    }
}
