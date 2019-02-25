//自定义异常类，继承Exception
public class InsufficientFundsException extends Exception{
    //此处的amount用来存储出现的异常（取出的钱多于余额时）所缺乏的钱
    private  double amount;
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
