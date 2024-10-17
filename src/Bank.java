import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name, List<Account> accounts){
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    protected void listAccounts(){
        System.out.printf("Bank %s", this.getName());
        System.out.println(" ");
        List<Account> myAccounts = this.getAccounts();
        for (Account account : myAccounts){
            System.out.printf("Agência da conta: %d%n", account.getAgency());
            System.out.printf("Número da conta: %d%n", account.getNumber());
        }

    }
}
