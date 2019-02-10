import java.util.ArrayList;

public class Main11 {
    public static void main(String[] args){
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray1 = new ArrayList<String>();
        objArray1.add(0,"common1");
        objArray1.add(1,"common2");
        objArray1.add(2,"notcommon");
        objArray1.add(3,"notcomment1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray的数组元素：" +objArray);
        System.out.println("objArray1的数组元素：" + objArray1);
        System.out.println("objArray是否包含字符串common2：" +objArray.contains("common2"));
        System.out.println("objArray2是否包含数组 ObjArray?:"+objArray1.contains(objArray));
    }
}
