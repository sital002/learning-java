import java.util.HashMap;


public  class StudentManagement{
    private final HashMap<Integer, Student> students;
    StudentManagement(){
        students = new HashMap<>();
    }

    public  void addS(Student student){
        try {
            if (students.containsKey(student.roll)) {
                throw new IllegalArgumentException("Student already exists");
            }
            students.put(student.roll, student);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public Student get(int roll){
        return students.get(roll);
    }

}
