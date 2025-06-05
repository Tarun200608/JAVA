public class exercise {
        public static void main(String[] args) {
           
            
            // tarun.sleep();
            // Monkey jagan=new Humans();
            // jagan.bite();
            // Basicanimal faheem=new Humans();
            // faheem.eat();
        }
}
abstract class phone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone extends phone{
    void ring(){
        System.out.println("ringing....");
    }
    void lift(){

    }
    void disconnect(){
        
    }
}

// abstract class pen{
//      abstract void Write();
//      abstract void refil();
// }


// class fountainpen extends pen{
//     void Write() {
//         System.out.println("Writing....");
//     }
//     void refil(){
//         System.out.println("refil");
//     }



// }
// class Monkey{
//     public void jump(){

//     }
//     public void bite(){
//         System.out.println("Biting..");
//     }
// }
// interface Basicanimal{
//     void eat();
//     void sleep();
// }
// class Humans extends Monkey implements Basicanimal{
//     public void eat(){
//         System.out.println("eating...");
//     }
//     public void sleep(){
//         System.out.println("sleeping....");
//     }
// }