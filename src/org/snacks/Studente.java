package org.snacks;

public class Studente {

  private String name;
  private String surname;
  private int age;

  // ; Constructor
  public Studente(String name, String surname, int age) {

    this.name = name;
    this.surname = surname;
    this.age = age;

  }


  // , Getter 
  public String getStudent(){
    return name + " " + surname + ", " + age + " anni";
  }
}
