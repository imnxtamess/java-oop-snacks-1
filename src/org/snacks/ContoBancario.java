package org.snacks;

public class ContoBancario {

  private int iban;
  private float balance;

  // ; constructor

  public ContoBancario(int iban) {

    this.iban = iban;
    balance = 0;
  }

  // , setters

  public void depositBalance(float amount) {
    balance = amount + balance;

  }

  public void withdrawBalance(float amount) {
    if (balance >= amount) {
      balance = balance - amount;
    }
  }

  // > getters

  public float getBalance() {
    return balance;
  }

}
