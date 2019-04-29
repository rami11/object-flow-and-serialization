import java.io.File;

public class Main {

    private static final String ACCOUNT_FILE_PATH = "resources/account.txt";

    public static void main(String[] args) {

        Management mng = new Management();
        mng.parseAccountTxt(new File(ACCOUNT_FILE_PATH));

        mng.displayCheckingAccounts();
        mng.displaySavingsAccounts();
    }
}
