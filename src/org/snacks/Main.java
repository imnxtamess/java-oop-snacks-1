package org.snacks;

public class Main {

  public static void main(String[] args) {

    Studente Giovanni = new Studente("Giovanni", "Giovannini", 34);

    // System.out.println(Giovanni.getStudent());

    ContoBancario GiovanniCb = new ContoBancario(3213213);

    GiovanniCb.depositBalance(15);
    GiovanniCb.withdrawBalance(15);
    // System.out.println(GiovanniCb.getBalance());

    RegistroStudenti registroStudenti = new RegistroStudenti();

    registroStudenti.addStudent("Davide", "Morisco", 27);
    registroStudenti.addStudent("Kuke", "Marslev", 24);

    registroStudenti.getStudentList();

  }
}
