import java.io.File;

public class Main29 {
    public static void main(String [] args){
        File oldName = new File("E:\\first-git-master\\Test.txt");
        File newName = new File("E:\\first-git-master\\nameTest.txt");
        if(oldName.renameTo(newName)){
            System.out.println("已重命名");
        }else{
            System.out.println("Error");
        }
    }
}
