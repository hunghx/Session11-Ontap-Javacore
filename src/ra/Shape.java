package ra;

import java.io.Serializable;

public class Shape implements Serializable {
    private double chuVi , dienTich;

    public Shape() {
    }

    public Shape(double chuVi, double dienTich) {
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void calArea(){
        System.out.println("chuwa tinhs ddc");
    }
    public void calPerimeter(){
        System.out.println("chua tinhs dc");
    }
}
