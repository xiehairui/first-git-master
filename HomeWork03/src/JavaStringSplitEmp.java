public class JavaStringSplitEmp {
    public static void main(String[] args){
        String str = "Hello-world ,Hello-wangmin";
        String[] temp;
        String delimeter = "-";//定义分隔符文字
        temp = str.split(delimeter);
        //普通的for循环
        for(int i = 0;i<temp.length;i++){
            System.out.println(temp[i]);
            System.out.println(" ");
        }

    }
}
