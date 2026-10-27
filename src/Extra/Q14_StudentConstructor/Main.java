package Extra.Q14_StudentConstructor;

class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println(name);
        System.out.println(marks);
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Shivaaya", 95);
        Student s2 = new Student("Ajay", 90);

        s1.display();
        s2.display();
    }

}