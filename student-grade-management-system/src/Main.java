public class Main {
    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();

        for (int i = 0;i<5;i++) {
//            studentManagement.add(new Student("Ram", "Poudel", 30, Gender.MALE, 6));
        }
//        studentManagement.add(new Student("Hari","Chaudhary",30,Gender.MALE,9));
//        studentManagement.display();
       Student s =  studentManagement.getByRoll(5);
        System.out.println(s);
    }
}