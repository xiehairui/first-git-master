public class MyClass01 {
    public static void main(String[] args){
        MyClass01 t = new MyClass01(3);

        t.info();
        t.info("重载方法");
        //重载构造函数
        new MyClass01();


    }
    int height;
    MyClass01(){
        System.out.println("无参数构造函数");
        height = 4;
    }
    MyClass01(int i){
        System.out.println("房子高度为" + i+"米");
        height = i;
    }
    void info(){
        System.out.println("房子的高度为"+height+"米");
    }
    void info(String s){
        System.out.println(s+":房子的高度为" +height+"米");
    }

}
