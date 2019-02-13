import java.util.Date;
import java.text.SimpleDateFormat;

public class Time_Test01 {
    public static void main(String[] args){
        SimpleDateFormat time = new SimpleDateFormat();//格式化时间
        time.applyPattern("yy-MM-dd HH:mm:ss a");
        Date date= new Date();//获取当前时间
        System.out.println("当日时间为：" +time.format(date));
    }
}
