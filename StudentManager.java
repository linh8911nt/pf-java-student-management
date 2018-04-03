public class StudentManager {
    Student[] students = new Student[20];
    int size;

    public StudentManager() {

    }

    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    public void findStudent(String name) {

    }

    public void displayAll() {
        if (size == 0) {
            System.out.println("There is no student in list!");
        } else if (size == 1) {
            System.out.println("There is one student in list!");
            System.out.println(students[0].getInfomation());
            System.out.println();
        } else {
            System.out.println("There are " + size + " student list: ");
            for (int i = 0; i < size; i++) {
                System.out.print(students[i].getInfomation() + ", ");
            }
            System.out.println();
        }
    }

}
