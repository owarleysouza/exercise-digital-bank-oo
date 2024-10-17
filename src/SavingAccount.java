public class SavingAccount extends Account {
    public SavingAccount(Client client) {
        super(client);
    }

    public void printAccountInfos() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printAccountData();
    }
}
