import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("=== Welcome to Digital Bank ===");

        Client warley = new Client("Warley");
        Account checkingAccount = new CheckingAccount(warley);
        Account savingAccount = new SavingAccount(warley);

        checkingAccount.deposit(100);
        checkingAccount.transfer(60, savingAccount);

        checkingAccount.printAccountData();
        savingAccount.printAccountData();

        List<Account> myAccountsList = Arrays.asList(checkingAccount, savingAccount);

        Bank myBank = new Bank("Banco X", myAccountsList);
        myBank.listAccounts();

    }
}