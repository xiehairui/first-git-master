import java.io.File;
import java.util.Date;

public class Main33 {
    public static void main(String[] args){
        File file = new File("E:\\first-git-master\\nameTest.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
