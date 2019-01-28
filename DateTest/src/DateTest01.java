import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当地时间：" + ft.format(date1));
        System.out.println(date.toString());
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }
}
