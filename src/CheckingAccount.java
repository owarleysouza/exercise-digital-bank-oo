public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    public void printAccountInfos() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printAccountData();
    }
}
