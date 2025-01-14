import java.io.*;
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
            FileWriter writer = new FileWriter("students.txt", true);

            writer.append(student.firstName).append("\t").append(student.lastName).append("\n");
//            writer.append(String.valueOf(student.roll)).append("\t").append(student.firstName).append("\t").append(student.lastName).append("\t").append(String.valueOf(student.grade)).append("\n");
            writer.close();

            students.put(student.roll, student);
//            System.out.println("Student added successfully " + student.roll + " " + student.firstName + " " + student.lastName);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

    public void display()  {
//        students.forEach((k,v)->{
//            System.out.println(v.firstName+" "+v.lastName+" "+v.roll+" "+v.age+" "+v.gender+" "+v.grade);
//        });

        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            while(reader.readLine() != null) {
                String line = reader.readLine();
                if(line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
            System.out.println(e.getMessage());
            return null;
        }
    }

}
