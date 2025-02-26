public class Main {
    public static void main(String[] args) {
        Conta genisson = new Conta("Genisson Emilio dos Santos");
        genisson.openAccount("cc");
        genisson.depositMoney(33.5f);
        //genisson.withdrawMoney(10f);
        genisson.payMonthlyFree();
        genisson.withdrawMoney(61.5f);
        genisson.closeAccount();

        genisson.showStatus();
    }
}