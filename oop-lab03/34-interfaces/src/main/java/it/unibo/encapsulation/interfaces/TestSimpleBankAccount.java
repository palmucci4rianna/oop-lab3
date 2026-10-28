package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        final SimpleBankAccount andreaAccount = new SimpleBankAccount(1, 1000);
        final SimpleBankAccount alexAccount = new SimpleBankAccount(2, 1000);

        // 4) Effettuare una serie di depositi e prelievi
        andreaAccount.deposit(1, 100);
        andreaAccount.withdraw(1, 50);
        andreaAccount.depositFromATM(1, 200);
        andreaAccount.withdrawFromATM(1, 150);
        andreaAccount.chargeManagementFees(1);
        alexAccount.deposit(2, 200);
        alexAccount.withdraw(2, 100);
        alexAccount.depositFromATM(2, 300);
        alexAccount.withdrawFromATM(2, 50);
        alexAccount.chargeManagementFees(2);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println("Andrea's account balance: " + andreaAccount.getBalance());
        System.out.println("Alex's account balance: " + alexAccount.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        andreaAccount.withdraw(2, 100); // Should not affect Andrea's account
        System.out.println("Andrea's account balance after wrong ID withdrawal attempt: " + andreaAccount.getBalance());

        // 7) Controllare nuovamente l'ammontare
        System.out.println("Final Andrea's account balance: " + andreaAccount.getBalance());
        System.out.println("Final Alex's account balance: " + alexAccount.getBalance());
    }
}
