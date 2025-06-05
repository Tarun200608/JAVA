class Employee{
    Employee(){
        System.out.println("I am a constructer....");
    }
    Employee(int x){
        System.out.println("i am a overloaded constructer with x:"+x);
    }
}
class Derived extends Employee{
    Derived(){
        //super(0);
        System.out.println("i am a derived constructor");
    }

    Derived(int x,int y){
        super(x);
        System.out.println("i am a overloaded constructer in derived class with y:"+y);
    }
}
class childderived extends Derived{
    childderived(int x,int y,int z){
        super(x,y);
        System.out.println("i am a overloaded constructer in child derived constructer with value z:"+z);
    }
}
public class Constructor {
    public static void main(String[] args) {
        childderived c=new childderived(23,45,67);
        // Derived d=new Derived();
        //Derived d=new Derived(25,56);
        //Employee e=new Employee();
        
    }
}