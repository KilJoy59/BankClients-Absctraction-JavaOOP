public class Test {
    public static void main(String[] args) {
        IndividualClient user1 = new IndividualClient("12345");

        user1.deposit(1000);
        user1.withdraw(500);
        user1.balance();
        user1.withdraw(1000);
        user1.balance();
        System.out.println();


        EntityClient user2 = new EntityClient("555");
        user2.deposit(1000);
        user2.withdraw(200);
        user2.balance();
        System.out.println();


        SelfEmployedClient user3 = new SelfEmployedClient("123");
        user3.deposit(1000);
        user3.balance();
        user3.deposit(600);
        user3.balance();
    }
}
