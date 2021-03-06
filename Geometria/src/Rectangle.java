public class Rectangle extends Figura implements Runnable {

    private double l1;
    private double l2;

    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public String toString() {
        return "Rectangle l1:" +this.l1+"l2:" +this.l2+"area:[("+this.area()+")]";
    }

    @Override
    public double area() {
        return this.l1 *this.l2;
    }

    @Override
    public double Perimetro() {
        final double v = this.l1 + this.l1 + this.l2 + this.l2;
        return v;
    }

    public double getL1(){
        return l1;
    }
    public void setL1() {
        this.l1 = l1;
    }
    public double getL2() {
        return l2;
    }

    @Override
    public void run() {

    }
}
