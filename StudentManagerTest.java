public class StudentManagerTest {
    public static void main(String[] args) {
        Student andy = new Student("Andy", 23);
        System.out.println(andy.getInfomation());
        System.out.println("name: " + andy.getName());
        System.out.println("age: " + andy.getAge());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(andy);
        System.out.println("added" + andy.getInfomation());
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.addStudent(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.displayAll();

        Student samy = new Student("Samy", 22);
        studentManager.addStudent(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.displayAll();
    }
}
