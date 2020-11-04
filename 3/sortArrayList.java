import java.util.ArrayList;

public class sortArrayList {
    public static void sort(ArrayList<Double> list){
        int lens=list.size();
        for(int i=lens-1;i>0;){
            int lastChange=0;
            for(int j=0;j<i;j++){
                if(list.get(j)>list.get(j+1)){
                    lastChange=j;
                    double temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
            if(lastChange==0)
                return;
            i=lastChange-1;
        }
    }
}
