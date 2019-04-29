import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Management {
    private List<SavingsAccount> savingsAccounts;
    private List<CheckingAccount> checkingAccounts;

    public Management() {
        savingsAccounts = new ArrayList<>();
        checkingAccounts = new ArrayList<>();
    }

    public void addCheckingAccount(CheckingAccount checkingAccount) {
        checkingAccounts.add(checkingAccount);
    }

    public void addSavingsAccount(SavingsAccount savingsAccount) {
        savingsAccounts.add(savingsAccount);
    }

    public void displaySavingsAccounts() {
        savingsAccounts.forEach(System.out::println);
    }

    public void displayCheckingAccounts() {
        checkingAccounts.forEach(System.out::println);
    }

    public void parseAccountTxt(File txtFile) {
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader(txtFile))) {

                String line;
                while ((line = reader.readLine()) != null) {

                    StringTokenizer strTokenizer = new StringTokenizer(line, ",");

                    String accountType = strTokenizer.nextToken();
                    String owner = strTokenizer.nextToken();
                    double balance = Double.parseDouble(strTokenizer.nextToken());
                    String currency = strTokenizer.nextToken();


                    if (accountType.equals("E")) {
                        SavingsAccount newSavingsAccount = new SavingsAccount(owner, balance, currency);

                        addSavingsAccount(newSavingsAccount);
                    } else if (accountType.equals("C")) {
                        CheckingAccount newCheckingAccount = new CheckingAccount(owner, balance, currency);

                        double maxDiscovered = Double.parseDouble(strTokenizer.nextToken());
                        newCheckingAccount.setMaxDiscovered(maxDiscovered);

                        addCheckingAccount(newCheckingAccount);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
