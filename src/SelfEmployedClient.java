public class SelfEmployedClient extends Client {

    SelfEmployedClient(String id) {
        super(id);
    }

    @Override
    public void deposit(double money) {
        if (money < 1000) {
            money -=(money*1)/100;
        }
        if (money >= 1000) {
            money -=(money*0.5)/100;
        }
        super.deposit(money);
    }
}
