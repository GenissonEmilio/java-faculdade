import java.util.Random;

public class Conta {
    public int numAccount;
    protected String typeAccount;
    private String ownerName;
    private float balance;
    private boolean status;

    public Conta(String ownerName) {
        this.setStatus(false);
        this.setBalance(0);
        this.setOwnerName(ownerName);
        this.setNumAccount(generateAccountNumber());
    }

    public void showStatus() {
        System.out.printf("Conta: %d\n", this.getNumAccount());
        System.out.printf("Tipo: %s\n", this.getTypeAccount());
        System.out.printf("Nome: %s\n", this.getOwnerName());
        System.out.printf("Saldo: %.2f\n", this.getBalance());
        System.out.printf("Estado: %b\n", this.getStatus());
    }

    public int generateAccountNumber() {
        Random random = new Random();
        int min = 1000000;
        int max = 99999999;
        int randomNamber = random.nextInt((max - min) + 1) + min;
        return randomNamber;
    }

    public void openAccount(String typeAccount) {
        this.setStatus(true);
        this.setTypeAccount(typeAccount);

        if (typeAccount.equalsIgnoreCase("cc")) {
            this.setBalance(50);
        } else if (typeAccount.equalsIgnoreCase("cp")) {
            this.setBalance(150);
        } else {
            System.out.println("ERRO! Tipo de conta invalido");
        }
    }

    public void closeAccount() {
        if (this.getBalance() == 0) {
            this.setStatus(false);
            this.setNumAccount(0);
        } else {
            System.out.println("ERRO! Você não pode fechar a conta caso tenha dinheiro nela ou esteja individado");
        }
    }

    public void depositMoney(float money) {
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + money);
        } else {
            System.out.println("ERRO! Você precisa abrir uma conta para depositar dinheiro");
        }
    }

    public void withdrawMoney(float amount) {
        if (this.getStatus() && this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("ERRO! Você precisa ter uma conta aberta e ter saldo nela para sacar dinheiro");
        }
    }

    public void payMonthlyFree() {
        int valor = 0;

        if (this.getTypeAccount().equalsIgnoreCase("cc")) {
            valor = 12;
        } else if(this.getTypeAccount().equalsIgnoreCase("cp")) {
            valor = 20;
        } else {
            System.out.println("ERRO! Tipo de conta invalido");
        }

        if (this.getStatus() && this.getBalance() >= valor) {
            this.setBalance(this.getBalance() - valor);
        } else {
            System.out.println("ERRO! Conta fechada ou saldo insuficiente");
        }
    }

    public int getNumAccount() {
        return numAccount;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public float getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
