public class Account {
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCE = 1;

    private int agency;
    private int number;
    private double balance;
    private Client client;

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCE++;
        this.client = client;
    }

    public void toWithDraw(double valor) {
        balance -= valor;
    }


    public void deposit(double valor) {
        balance += valor;
    }


    public void transfer(double valor, Account targetAccount) {
        this.toWithDraw(valor);
        targetAccount.deposit(valor);
    }

    protected void printAccountData() {
        System.out.printf("Titular: %s%n", this.client.getName());
        System.out.printf("Agencia: %d%n", this.agency);
        System.out.printf("Numero: %d%n", this.number);
        System.out.printf("Saldo: %.2f%n", this.balance);
    }

}
