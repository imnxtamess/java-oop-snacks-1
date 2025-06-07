package org.snacks;

public class RegistroStudenti {

  private Studente[] students;
  private int studentNumber;

  // ; constructor

  public RegistroStudenti() {
    students = new Studente[30];
    studentNumber = 0;
  }

  // , setters

  public void addStudent(Studente studente) {
    if (studentNumber < students.length) {
      students[studentNumber] = studente;
      studentNumber++;
    } else {
      System.out.println("The student list is full");
    }
  }

  // > getters

  public void getStudentList() {
    for (int i = 0; i < students.length; i++) {
      if (students[i] != null) {
        System.out.println(students[i].getStudent());
      } else {
        break;
      }

    }
  }

}
