import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main12 {
    public static void main(String [] args){
        int[] ary = {1,2,3,4,5,6,7};
        int[] ary1 ={1,2,3,4,5,6,7};
        int[] ary2 = {1,2,3};
        System.out.println("ary与ary1是否相等"+ary.equals(ary1));//比较的是内存地址
        System.out.println("ar1与ary2是否相等" +ary1.equals(ary2));
        System.out.println("ary与ary1是否相等"+Arrays.equals(ary,ary1));//比较的是内容
        System.out.println("ar1与ary2是否相等" +Arrays.equals(ary1,ary2));
    }
}
