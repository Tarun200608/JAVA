public class inhritance {
        public static void main(String[] args) {
            circle r=new circle(56);
            //cylinder c=new cylinder();
        }
}
class circle{
    public int radius;
    circle(int a){
        this.radius =a;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
