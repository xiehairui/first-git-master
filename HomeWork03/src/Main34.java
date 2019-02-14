import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;

public class Main34 {
    public static void main(String [] args){
        try{
            File file = new File("E:\\first-git-master\\nameTest.txt");
            if (file.createNewFile()){
                System.out.println("文件创建成功！");
            }else {
                System.out.println("出错了，文件已经存在。");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
