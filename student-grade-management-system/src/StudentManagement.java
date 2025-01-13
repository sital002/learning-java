import java.util.HashMap;


public  class StudentManagement{
    private final HashMap<Integer, Student> students;
    StudentManagement(){
        students = new HashMap<>();
    }

    public  void add(Student student){
        try {
            if (students.containsKey(student.roll)) {
                throw new IllegalArgumentException("Student already exists");
            }
            students.put(student.roll, student);
            System.out.println("Student added successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void display(){
        students.forEach((k,v)->{
            System.out.println(v.firstName+" "+v.lastName+" "+v.roll+" "+v.age+" "+v.gender+" "+v.grade);
        });
    }
    public Student get(int roll){
        return students.get(roll);
    }
    public  Student remove(int roll){
        try {
            if (!students.containsKey(roll)) {
                throw new IllegalArgumentException("Student does not exist");
            }
            System.out.println("Student removed sucessfully");  
            return students.remove(roll);
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

}
