import java.util.Date;

public class useDataClass {
    public static void main(String[] args){
        Date date = new Date();
        long passingTime = 1000;
        date.setTime(passingTime);
        for(int i=0;i<8;i++){
            passingTime *= 10;
            date.setTime(passingTime);
            System.out.printf("After the pass of "+passingTime+" millisecond, the time is:\n");
            System.out.println(date.toString()+"\n");
        }

    }
}
