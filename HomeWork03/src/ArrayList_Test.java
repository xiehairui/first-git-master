import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Test {
    public static void main(String [] args){
        List<String> list  = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHAH");
        //第一种方法，用foreach遍历List
        for(String str :list){
            System.out.println(str);
        }
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(String str : strArray){
            System.out.println(str);
        }
        //第三种遍历 使用迭代器进行相关的遍历
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){//判断下一个元素的值
            System.out.println(ite.next());
        }
    }
}
