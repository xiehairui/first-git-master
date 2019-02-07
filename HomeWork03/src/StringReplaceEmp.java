public class StringReplaceEmp {
    public static void main(String[] args){
        String str = "Hello world";
        System.out.println(str.replace('H','T'));
        System.out.println(str.replaceFirst("He","Wa"));
        System.out.println(str.replaceAll("He","Ha"));
    }
}
