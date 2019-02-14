import java.io.File;

public class Main32 {
    public static void main(String [] args) throws  Exception{
        File file = null;
        File dir = new File("E:/");
        file = File.createTempFile("javaTemp",".javatemp",dir);
        System.out.println(file.getPath());
    }
}
