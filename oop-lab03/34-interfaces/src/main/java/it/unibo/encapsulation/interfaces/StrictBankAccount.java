package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    private final int id;
    private double balance;
    private int transactions;

    private static final double ATM_TRANSACTION_FEE = 1.0;
    private static final double MANAGEMENT_FEE = 5.0;
    private static final double TRANSACTION_FEE = 0.1;
    
    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
        this.transactions = 0;
    }

    private boolean checkUser(final int id) {
        return this.id == id;
    }

    @Override
    public void withdraw(final int id, final double amount){
        if (checkUser(id) && amount <= this.balance) {
            this.balance -= amount;
            this.transactions++;
        }
    }

    @Override
    public void deposit(final int id, final double amount){
        if (checkUser(id)) {
            this.balance += amount;
            this.transactions++;
        }
    }

    @Override
    public void depositFromATM(final int id, final double amount){
        if (checkUser(id)) {
            this.balance += (amount - ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    @Override
    public void withdrawFromATM(final int id, final double amount){
        if (checkUser(id) && (amount + ATM_TRANSACTION_FEE) <= this.balance) {
            this.balance -= (amount + ATM_TRANSACTION_FEE);
            this.transactions++;
        }
    }

    @Override
    public void chargeManagementFees(final int id){
        if (checkUser(id)) {
            final double totalFees = MANAGEMENT_FEE + (this.transactions * TRANSACTION_FEE);
            if (this.balance >= totalFees) {
                this.balance -= totalFees;
            } else {
                this.balance = 0; // evita bilanci negativi
            }
            this.transactions = 0;
        }
    }

    @Override
    public double getBalance(){
        return this.balance;
    }

    @Override
    public int getTransactionsCount(){
        return this.transactions;
    }
}