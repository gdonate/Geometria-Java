public abstract class Figura {

    public abstract double area();

    public int compareTo(Figura f){
        return (int) (f.area()-this.area());
    }

}
