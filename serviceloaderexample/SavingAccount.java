
package serviceloaderexample;


public class SavingAccount implements Account {
    String branch;
    int balance;
    String type ="SAVINGACCOUNT";
    
     @Override
    public int getBalance() {
        return balance;
    }
    @Override
    public String getBranch() {
        return branch;
    }
    public String getType() {
        System.out.println("Inside of the Saving Account");
        return type;
    }
    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setType(String type) {
        this.type = type;
    }
}
