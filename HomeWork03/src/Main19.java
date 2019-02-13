enum Car{
    lamborghi,tata,audi,fiat,honda
}
public class Main19 {
    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c) {
            case lamborghi:
                System.out.println("你选择了lamborghini!");
                break;
            case tata:
                System.out.println("你选择了tata！");
                break;
            case audi:
                System.out.println("选择了audi！");
                break;
            case fiat:
                System.out.println("选择了fiat!");
                break;
            case honda:
                System.out.println("选择了honda");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }
    }
}
