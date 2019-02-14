import java.io.File;

public class Main28 {
    public static void main(String[] args){
        long size = getFileSize("E:\\first-git-master\\Test.txt");
        System.out.println("所选文件的大小为：" + size);
    }
    public static long getFileSize(String filename){
        File file = new File(filename);
        if (!file.exists()||!file.isFile()){
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
}
