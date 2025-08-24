import java.io.*;
import java.util.*;

// Student class with encapsulation
class Student implements Serializable {
    private int rollNo;
    private String name;
    private int age;
    private double marks;

    public Student(int rollNo, String name, int age, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getters and setters
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name +
               ", Age: " + age + ", Marks: " + marks;
    }
}

public class StudentManagementSystem {
    private static final String FILE_NAME = "students.dat";
    private static ArrayList<Student> students = new ArrayList<>();

    // Load students from file
    @SuppressWarnings("unchecked")
    private static void loadStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (ArrayList<Student>) ois.readObject();
        } catch (Exception e) {
            students = new ArrayList<>(); // if file not found or empty
        }
    }

    // Save students to file
    private static void saveStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }

    // Add student
    private static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(rollNo, name, age, marks));
        System.out.println("✅ Student added successfully!");
    }

    // View all students
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Search student by roll no
    private static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update student
    private static void updateStudent(Scanner sc) {
        System.out.print("Enter Roll No to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter New Age: ");
                s.setAge(sc.nextInt());
                System.out.print("Enter New Marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student
    private static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getRollNo() == rollNo) {
                it.remove();
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadStudents();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(sc); break;
                case 4: updateStudent(sc); break;
                case 5: deleteStudent(sc); break;
                case 6:
                    saveStudents();
                    System.out.println("💾 Data saved. Exiting...");
                    sc.close();
                    return;
                default: System.out.println("❌ Invalid choice!");
            }
        }
    }
}
