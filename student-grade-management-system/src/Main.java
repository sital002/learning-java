public class Main {
    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();

        for (int i = 0;i<50;i++) {
//            studentManagement.add(new Student("Ram", "Poudel", 30, Gender.MALE, 6));
        }
//        studentManagement.add(new Student("Hari","Chaudhary",30,Gender.MALE,9));
//        studentManagement.display();
//       Student s =  studentManagement.getByRoll(3);
        studentManagement.deleteByRoll(4);
//        System.out.println(s);
    }
}