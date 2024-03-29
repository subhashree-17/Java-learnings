package com.javalearnings.problems;


public interface Enrollable {
    void enrollInCourse(Course course);
}


class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Enrollable enrollee) {
        if (enrollee instanceof Student) {
            Student student = (Student) enrollee;
            System.out.println(student.getName() + " enrolled in course: " + name);
        } else {
            System.out.println("Cannot enroll object in course.");
        }
    }
}


class Student implements Enrollable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void enrollInCourse(Course course) {
        course.enrollStudent(this); // Enrolls the student in the course
    }
}


class CouplingSolutionUniversity {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Java Programming");
        Student student = new Student("John Doe");

        student.enrollInCourse(course);
    }
}
