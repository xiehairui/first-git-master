import java.util.ArrayList;

public class Main10 {
    public static void main(String [] args){
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 =new ArrayList();
        arrayList.add(0,"wang");
        arrayList.add(1,"min");
        arrayList.add(2,"xie");
        arrayList1.add(0,"wang");
        arrayList1.add(1,"qi");
        arrayList2.add(0,"xie");
        arrayList2.add(1,"hai");
        arrayList2.add(2,"rui");
        System.out.println("arrayList元素" +arrayList);
        System.out.println("arrayList1元素" +arrayList1);
        System.out.println("arrayList2元素" +arrayList2);
        arrayList.retainAll(arrayList1);
        System.out.println("arrayList与arrayList的交集"+ arrayList);



    }
}
