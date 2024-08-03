package entities;

/**
 * <h1> DEVSUPERIOR - Java Spring Expert - Capítulo 2: Testes automatizados</h1>
 * DESAFIO: Testes automatizados
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   03/08/2024
 */
public class Account {
    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private Long id;
    private Double balance;

    public Account(){}

    public Account(Long id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount>balance){
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    public double fullWithdraw(){
        double aux = balance;
        balance = 0.0;
        return aux;
    }

}
