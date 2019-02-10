import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args){
        String a[] = {"王","敏","我",};
        String b[] = {"爱","你"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

    }
}
