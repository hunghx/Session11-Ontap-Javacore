package ra;

import java.io.Serializable;

public class Student implements Serializable ,Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    int id;
    String name;
    int age;
    public Student(String s) {
    }

    public Student() {

    }
    public  String  getInfo(){
        return "Name :"+name+"| Age :"+age;
    }

    @Override
    public String toString() {
        return "null";
    }

}
