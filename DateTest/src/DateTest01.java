import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当地时间：" + ft.format(date1));
        System.out.println(date.toString());
    }
}
