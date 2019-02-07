public class SearchStringEmp {
    public static void main(String [] args){
        String strOrig = "hello World";
        int intIndex = strOrig.indexOf("d");
        if(intIndex == -1){
            System.out.println("没有查找到字符串hello");
        }else{
            System.out.println("字符串的位置：" + intIndex);
        }
    }
}
