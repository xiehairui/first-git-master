import java.io.*;


public class Main50 {
    public static void main(String[] args){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.close();
            System.out.println("文件创建成功！");
        }catch(IOException e){

        }

        try{
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while((str=in.readLine())!=null){
                System.out.println(str);
            }
            System.out.println(str);
        }catch(IOException e){

        }
    }
}
