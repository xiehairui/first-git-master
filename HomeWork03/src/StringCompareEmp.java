public class StringCompareEmp {
    public static void main(String [] args){
        String str ="Hello world";
        String anotherstr = "Hello World";
        Object objStr = str;
        System.out.println(str.compareTo(anotherstr));
        System.out.println(str.compareToIgnoreCase(anotherstr));//忽略大小写
        System.out.println(str.compareTo(objStr.toString()));

    }
}
