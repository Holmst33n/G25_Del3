package main.java;

public class Account {
    private int balance;
    private boolean hasLost;

    //-----------------------------------------------------------------
    //  Sets up the account by defining initial balance.
    //-----------------------------------------------------------------
    public Account () {
        balance = 20;
    }

    //-----------------------------------------------------------------
    //  Deposits the specified amount into the account. Returns the
    //  new balance.
    //-----------------------------------------------------------------

    public void setBalance(int amount) {

        if(amount < 0) {
            this.balance += amount;
        }
        else if(amount > 0) {
            this.balance -= amount;
        }

        if(this.balance < 0 || this.balance == 0){
            System.out.println("Du er gået fallit, du har tabt spillet!");
            this.hasLost = true;
        }

    }

    public boolean checkIfLost(){
        return this.hasLost;
    }

    public int deposit (int amount) {
        balance = balance + amount;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Withdraws the specified amount from the account. Returns the new balance.
    //-----------------------------------------------------------------
    public int withdraw (int amount) {

        balance = balance + amount;
        if (balance < 0) {
            balance = 0;
        }
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public int getBalance() {
        return balance;
    }

}


