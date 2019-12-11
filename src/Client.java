abstract class Client {

    private String accountId;
    private int balance;

    Client(String id) {
        accountId = id;
    }

    public void balance() {
        System.out.println("Баланс равен " + balance);
    }

    public void withdraw(double money) {
        balance -= money;
        System.out.println("Вы сняли " + money + " рублей(-я)");
        if (balance < 0) {
            balance += money;
            System.out.println("Недостаточно средств!\nСчет не может быть отрицательным");
        }
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("Пополнение на сумму " + money);
    }
}
