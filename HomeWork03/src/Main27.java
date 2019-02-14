import java.io.File;
import java.util.Date;

public class Main27 {
    public static void main(String[] args) throws Exception{
        File fileToChange = new File("E:\\first-git-master\\Test.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
