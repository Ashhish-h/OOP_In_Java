package OOPS;

public class CopyConstructor{
    public static void main(String[] args){
        Chatra Student1 = new Chatra();
        Student1.setEnroll(115284823);
        System.out.println(Student1.getEnroll());
    }
}

class Chatra{
    String name;
    int rollNo;
    String course;
    private int enrollNo;
    public void setEnroll(int No){
        this. enrollNo = No;
    }

    public int getEnroll(){
        return enrollNo;
    }
}