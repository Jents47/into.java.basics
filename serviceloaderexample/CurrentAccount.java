package serviceloaderexample;


public class CurrentAccount implements Account {
    String branch;
    int balance;
    String type="CURRENTACCOUNT";

        @Override
    public int getBalance() {
        return balance;
    }
    
    @Override
    public String getType() {
        return branch;
    }
    
    @Override
    public String getBranch() {
        System.out.println("Inside type of current Account");
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
