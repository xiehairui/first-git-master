import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Test {
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
