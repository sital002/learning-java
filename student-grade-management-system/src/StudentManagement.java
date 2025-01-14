import java.io.*;


public  class StudentManagement{
    int totalStudents;
    StudentManagement(){
        this.totalStudents=0;
    }

    public  void add(Student student){
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            if(student.firstName.contains(",")) throw  new IllegalArgumentException("firstName contains ',' or ','");
            if(student.lastName.contains(",")) throw  new IllegalArgumentException("lastName contains ',' or ','");
            if(student.grade < 0 || student.grade > 12 ) throw  new IllegalArgumentException("grade must be between 0 and 12");
            if(student.age < 0 || student.age > 100 ) throw  new IllegalArgumentException("age must be between 0 and 100");
            student.roll = ++this.totalStudents;
            writer.append(String.valueOf(student.roll)).append(",").append(student.firstName).append(",").append(student.lastName).append(",").append(String.valueOf (student.grade)).append(",").append(student.gender.toString()).append(",").append(String.valueOf( student.age)).append("\n");
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }



    public  Student getByRoll(int roll){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while(( line = reader.readLine()) != null) {
                String [] data = line.split(",");
                int currentRoll = Integer.parseInt(data[0]);
                if(roll == currentRoll) {
                    String firstName = data[1];
                    String lastName = data[2];
                    int grade = Integer.parseInt(data[3]);
                    Gender gender = Gender.valueOf(data[4]);
                    int age = Integer.parseInt(data[5]);
                    reader.close();
                    return new Student(firstName, lastName, grade, gender, age,roll);
                }
            }
            reader.close();
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void display()  {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            while(reader.readLine() != null) {
                String line = reader.readLine();
                if(line == null) break;
                String[] data = line.split(",");

                System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5]);
//                String firstName = data[1];
//                int grade = Integer.parseInt(data[3]);
//                int roll = Integer.parseInt(data[0]);
//                String lastName = data[2];
//                String grade = data[3];
//                String age = data[4];
//                String gender = data[5];
//           Student std = new Student(firstName,lastName,age,gender,grade);
//                System.out.println("Roll: " + roll);
//                System.out.println("First name: " + firstName);
//                System.out.println("Last name: " + lastName);
//                System.out.println("Grade: " + grade);
//                System.out.println("Age: " + age);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
