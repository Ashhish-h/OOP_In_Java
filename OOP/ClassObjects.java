package OOP;

public class ClassObjects {
    public static void main(String[] arge){
        Student Student1 = new Student();
        Student1.name = "Ashish";
        Student1.age = 18;
        Student1.grade = 2;
        Student1.percentage = 74.5;
        System.out.println(Student1.name);
    }
}

class Student{
    String name;
    int age;
    int grade;
    double percentage;
}