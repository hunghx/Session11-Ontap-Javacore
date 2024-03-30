package ra;

public class Circle extends Shape {
    private final double PI = 3.14;
    private  double banKinh;

    public Circle(double chuVi, double dienTich, double banKinh) {
        super(chuVi, dienTich); // goi phuong thuc khoi tao cua lop cha
        this.banKinh = banKinh;
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public Circle() {
    }

    @Override
    public void calArea() {
        super.setDienTich(PI*banKinh*banKinh);
    }

    @Override
    public void calPerimeter() {
        super.setChuVi(PI*banKinh*2);
    }
//    public void calSuperMethod(){
//        super.calArea();
//    }
}
