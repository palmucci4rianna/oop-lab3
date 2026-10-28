package it.unibo.composition;

public class Professor implements User {

    private static final String DOT = ".";
    private final String name;
    private final String surname;
    private final int id;
    private final String password;
    private final String[] courses;

    public Professor(
        final int id,
        final String name,
        final String surname,
        final String password,
        final String[] courses
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = courses[i];
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Student ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + "]";
    }

    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }
}
