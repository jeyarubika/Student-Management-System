public class Student {

    private int studentId;
    private String name;
    private int age;
    private String department;
    private String email;

    // Constructor
    public Student(int studentId, String name, int age, String department, String email) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display Student Details
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);
    }
}