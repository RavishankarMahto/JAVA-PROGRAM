import java.util.HashMap;
import java.util.Set;
public class Money {
    private int money;
    public Money() {

    }
    public Money(int money){
        this.money=money;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money=money;
    }
    public static void main(String[] args) {
        Money money = new Money(300);
        HashMap<Money, String>info=new HashMap<>();
        info.put(money,"Student");
        Set<Money> key = info.keySet();
        
        for(Money m:key){
            System.out.print("The Student:" + info.get(m));
            System.out.print(" and ");
            System.out.print("the student has ");
            System.out.print(money.getMoney());
            System.out.print(" dollars.");
        }
    }
    
}
