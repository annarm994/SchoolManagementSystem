public class Main {
    public static void main(String[] args) {
        // Create School
        School school = new School("Springfield High");

        // Create Departments
        Department science = new Department("Science");
        Department mathematics = new Department("Mathematics");

        // Add Teachers to Science
        science.addTeacher(new Teacher("Mr. Smith", "Biology"));
        science.addTeacher(new Teacher("Mrs. Jones", "Chemistry"));

        // Add Students to Science
        science.addStudent(new Student("John Doe", 10));
        science.addStudent(new Student("Jane Doe", 12));
        science.addStudent(new Student("Jim Beam", 11));

        // Add Teachers to Mathematics
        mathematics.addTeacher(new Teacher("Mr. White", "Calculus"));
        mathematics.addTeacher(new Teacher("Ms. Black", "Algebra"));

        // Add Students to Mathematics
        mathematics.addStudent(new Student("Tim Cook", 10));
        mathematics.addStudent(new Student("Ann Taylor", 11));
        mathematics.addStudent(new Student("Gary Oak", 12));

        // Add Departments to School
        school.addDepartment(science);
        school.addDepartment(mathematics);

        // Print School Details
        System.out.println("School: " + school.getName());
        for (Department dept : school.getDepartments()) {
            System.out.println("Department: " + dept.getName());
            System.out.println("- Teachers:");
            for (Teacher teacher : dept.getTeachers()) {
                System.out.println("  * " + teacher.getName() + " (" + teacher.getSubject() + ")");
            }
            System.out.println("- Students:");
            for (Student student : dept.getStudents()) {
                System.out.println("  * " + student.getName() + " (Grade " + student.getGradeLevel() + ")");
            }
        }
    }
}
