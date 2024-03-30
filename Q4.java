/*Create a class Student having member variable name, age, and mark
and required get and set methods. Create a LinkedList of Student type
and perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a Student object and print the existence of the
object. Specify is the object is search according to reference or contain.
(c.) Remove a specified Student object.
(d.) Count the number of object present in the list.
(e.)Override equals method checking if the two Student objects share all
the same values */


import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
        @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Ritikh", 20, 85.5));
        studentList.add(new Student("Prince", 22, 75.0));
        studentList.add(new Student("Retam", 21, 90.0));
        System.out.println("Student List:");
        displayStudentList(studentList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details to check existence (name age mark):");
        String name = scanner.next();
        int age = scanner.nextInt();
        double mark = scanner.nextDouble();
        Student studentToFind = new Student(name, age, mark);
        checkStudentExistence(studentList, studentToFind);
        System.out.println("Enter student details to remove (name age mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextDouble();
        Student studentToRemove = new Student(name, age, mark);
        removeStudent(studentList, studentToRemove);
        System.out.println("Number of students in the list: " + studentList.size());

        scanner.close();
    }
        public static void displayStudentList(LinkedList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
        }
    }
    public static void checkStudentExistence(LinkedList<Student> studentList, Student studentToFind) {
        boolean exists = false;
        for (Student student : studentList) {
            if (student.equals(studentToFind)) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Student exists in the list.");
        } else {
            System.out.println("Student does not exist in the list.");
        }
    }
    public static void removeStudent(LinkedList<Student> studentList, Student studentToRemove) {
        if (studentList.contains(studentToRemove)) {
            studentList.remove(studentToRemove);
            System.out.println("Student removed from the list.");
        } else {
            System.out.println("Student not found in the list.");
        }
    }
}
