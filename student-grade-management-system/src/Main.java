public class Main {
    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addS(new Student("Ram","Poudel",35,Gender.MALE,6,20));
//        Student ram = studentManagement.get(20);
//        System.out.println(ram.firstName+" "+ram.lastName);
//        studentManagement.addStudent(new Student("Ram","Poudel",35,Gender.MALE,6,20));
    }
}