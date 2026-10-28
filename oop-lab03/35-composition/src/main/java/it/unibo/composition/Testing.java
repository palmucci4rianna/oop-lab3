package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        final Student s1 = new Student(1, "Arianna", "Palmucci", "password1", 2020);
        final Student s2 = new Student(2, "Mario", "Rossi", "password2", 2019);
        final Student s3 = new Student(3, "Luigi", "Verdi", "password3", 2021);

        // 2)Creare 2 docenti a piacere
        final Professor p1 = new Professor(1, "Giovanni", "Bianchi", "password4", new String[]{"Matematica", "Fisica"});
        final Professor p2 = new Professor(2, "Francesca", "Neri", "password5", new String[]{"Informatica", "Chimica"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        final ExamRoom er1 = new ExamRoom(100, "Aula Magna", true, true);
        final ExamRoom er2 = new ExamRoom(80, "Aula 101", false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        final Exam exam1 = new Exam(1, 10, "Matematica", p1, er1);
        final Exam exam2 = new Exam(2, 2, "Informatica", p2, er2);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registeredStudents(s1);
        exam1.registeredStudents(s2);
        exam1.registeredStudents(s3);
        exam2.registeredStudents(s1);
        exam2.registeredStudents(s2);
        exam2.registeredStudents(s3); // non possibile

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1);
        System.out.println(exam2); 
    }
}
