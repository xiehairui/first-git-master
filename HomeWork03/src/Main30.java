import java.io.File;

public class Main30 {
    public static void main(String [] args){
        File file = new File("E:\\first-git-master\\nameTest.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
