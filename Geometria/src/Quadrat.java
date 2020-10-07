public class Quadrat extends Rectangle {

    public Quadrat (double l){

        super (l,l);

    }
    public String toString() {
        return "Quadrat:" + this.getL1() + "area:" + super.area() + "Perimetro:" +super.Perimetro();
    }
}
