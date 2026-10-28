import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            student.display();
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {
                System.out.println("Student Found!");
                student.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent(int id, String name, int age,
                              String department, String email) {

        for (Student student : students) {

            if (student.getStudentId() == id) {

                student.setName(name);
                student.setAge(age);
                student.setDepartment(department);
                student.setEmail(email);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {

                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}