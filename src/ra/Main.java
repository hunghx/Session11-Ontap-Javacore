package ra;

public class Main {
    // thuoc tinh
    String name;
    static int age;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Status status = Status.SUCCESS;

        Main obj  = new Main(); // cap phat dong
        System.out.println("Gia tri name : "+obj.name);

        Main obj1  = new Main(); // cap phat dong
        obj.name = "jchd";
        System.out.println(obj.name);

        Main.age = 10;


        System.out.println(obj.age);
        System.err.println("err");

//        Scanner sc1 = new Scanner(System.in);
////        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Nhap so");
//        int input1 = Integer.parseInt(sc1.nextLine());
//        // sc1.nextLine(); // bo qua nuot dong
//        System.out.println("Nhap chuoi");
//        String input2  = sc1.nextLine();
//        System.out.println(input1 + "|" + input2);
//
//
//        Integer a = new Integer(100);
//        int b = a.intValue(); // Integer -> int : unboxing
//        Integer c = Integer.valueOf(b); // int -> Integer : autoboxing
//
//        Integer[] numbers = new Integer[]{1,2,3,4,5};

//        for (int i = 0; i < 10 ; i++) {
////            if (i==3){
////                // thoat khoi vong lap
////                break;
////            }
////            if (i%2==0){
////                continue;
////            }
//            if (i==5){
//                return;
//            }
//            System.out.println(i);
//
//        }

//        switch (input1){
//            case 1:
//                System.out.println("so 1");
//                break;
//            case 2:
//                System.out.println("so 2");
//                break;
//            case 3:
//                System.out.println("so 3");
//                break;
//            default:
//                System.err.println("ko biet");
//        }
//

        Student student = new Student();
        student.name= "Nguyễn văn A";
        student.getInfo();

        Object student1 = new Student();
        System.out.println(student1.toString());

//        ra.Calculator<Integer> calculator = new ra.Calculator<>();
//        calculator.sum(1,2);
//        ra.Calculator<Double> calculatorDouble = new ra.Calculator<>();
//        calculatorDouble.sum(1.2,2.5);

        Student[] students = {new Student("s1"),new Student("s2"),new Student("s3")};
        Calculator.sort(students);

        Circle circle = new Circle(10);
        System.out.println(circle.getChuVi());
        System.out.println(circle.getDienTich());
//        circle.calSuperMethod();
        circle.calPerimeter();
        System.out.println(circle.getChuVi());
        System.out.println(circle.getDienTich());
    }

    @Override
    public String toString() {
        int a ;
            a = 10;
        return super.toString();
    }
    public void printName(String name){
        System.out.println(name);
    }
}