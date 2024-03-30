package util;


import ra.Circle;

import java.util.List;

public class TestIOFile {
    public static void main(String[] args) {
        Circle circle = new Circle(100);
        IOFile.writeToFileFirst("shape.txt",circle);
        Circle circle1 = new Circle(10);
        IOFile.writeToFile("shape.txt",circle1);
        Circle circle2 = new Circle(1000);
        IOFile.writeToFile("shape.txt",circle2);
        List<Circle> list = IOFile.readFromFile("shape.txt");
        for (Circle c: list){
            c.calArea();
            System.out.println("bans kinh : "+c.getDienTich());
        }
    }
}
