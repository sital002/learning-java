enum Gender {
    MALE, FEMALE
}

public class Student {
    String firstName;
    String lastName;
    int age;
    Gender gender;
    int grade;
    int roll;
    Student(String firstName, String lastName, int age, Gender gender, int grade,int roll) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.roll = roll;
    }

    Student(String firstName, String lastName, int age, Gender gender, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Roll: "+roll + " "+ firstName + " " + lastName + ", Age: " + age + ", Gender: " + gender + ", Grade: " + grade;
    }
}
