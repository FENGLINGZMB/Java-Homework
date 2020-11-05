import java.util.ArrayList;

public class sortArrayList {
    public static void sort(ArrayList<Number> list){
        int lens=list.size();
        for(int i=lens-1;;){
            int lastChange=0;
            for(int j=0;j<i;j++){
                if(list.get(j).doubleValue()>list.get(j+1).doubleValue()){
                    lastChange=j;
                    Number temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
            if(lastChange==0)
                return;
            i=lastChange;
        }
    }

    public static void main(String[] args){
        ArrayList<Number> list=new ArrayList<>();
        list.add(12);
        list.add(12.4);
        list.add(4.321);
        list.add(12);
        list.add(124);
        list.add(122);
        list.add(1.24);
        sort(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
