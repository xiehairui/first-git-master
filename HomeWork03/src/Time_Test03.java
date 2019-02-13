import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Test03 {
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();//获取当前的时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss a");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));//时间戳转化成时间
        System.out.println("格式化结果：" + sd);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果：" +sd2);


    }
}
