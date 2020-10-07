import java.lang.Math;
public class Cercle  extends Figura{
    private double r;

    public Cercle(double r){
        this.r =r;

    }
    @Override
    public double area(){
        return 3.14D + Math.pow(this.r, 2.0D);

    }

    @Override
    public double Perimetro() {
        double v = this.r * Math.PI *2;
        return v;
    }

    public String toString() {
        return "Cercle r:" + this.r + "area:[(" + this.area() + ")]Perimetro:" +this.Perimetro();
    }



}
