package tests.factory;

import entities.Account;

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
public class AccountFactory {
    public static Account createEmptyAccount(){
        return new Account(1L, 0.0);
    }

    public static Account createAccount(double initialBalance){
        return new Account(1L, initialBalance);
    }
}
