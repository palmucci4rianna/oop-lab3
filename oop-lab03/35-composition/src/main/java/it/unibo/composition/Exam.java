package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    int id;
    int nMaxStudents;
    int registeredStudents;
    String courseName;
    Professor professor;
    ExamRoom room;
    Student[] students;

    public Exam(
        final int id,
        final int nMaxStudents,
        final String courseName,
        final Professor professor,
        final ExamRoom room
    ) {
        this.id = id;
        this.nMaxStudents = nMaxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[nMaxStudents];
    }

    public void registeredStudents (Student student) {
        if (this.registeredStudents < this.nMaxStudents) {
            this.students[this.registeredStudents] = student;
            this.registeredStudents++;
        } else {
            System.out.println("No more available seats");
        }
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", professor=" + professor +
                ", room=" + room +
                ", nMaxStudents=" + nMaxStudents +
                ", registeredStudents=" + registeredStudents +
                ", students=" + Arrays.toString(Arrays.copyOf(students, registeredStudents)) +
                '}';   
    }
}
