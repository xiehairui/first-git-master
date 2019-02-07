public class SearchLastString {
    public static void main(String [] args){
        String strOrig = "Hello world ,Hello Earth";
        int lastIndex = strOrig.lastIndexOf("Earth");
        if (lastIndex == -1){
            System.out.println("Earth");
        }else{
            System.out.println("Earth 字符串最后出现的位置" + lastIndex);
        }
    }
}
