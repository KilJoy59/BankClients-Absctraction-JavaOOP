public class EntityClient extends Client {

    EntityClient(String id) {
        super(id);
    }

    @Override
    public void withdraw(double money) {
        money +=(money*1)/100;
        super.withdraw(money);
    }
}
