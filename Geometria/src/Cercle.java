public class Cercle  extends Figura{
    private double r;

    public Cercle(double r){
        this.r =r;

    }
    @Override
    public double area(){
        return Math.PI = Math.pow (this.r, 2);

    }
    public String toString() {
        return "Cercle r:" + this.r + "area:[(" + this.area() + ")]";
    }



}
