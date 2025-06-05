public class overriding {
        public static void main(String[] args) {
          MyThread1 t1 =new MyThread1("Tarun");
          MyThread1 t2 =new MyThread1("jagan");

          //t1.start();
          System.out.println("the id of the thread is "+t1.getId() );
          System.out.println("the id of the thread is "+t1.getName() );
          System.out.println("the id of the thread is "+t2.getId() );
          System.out.println("the id of the thread is "+t2.getName() );
        }
}
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
        while(true){

            System.out.println("My theard is running..");
            System.out.println("My code is running..");
        }
    }
}
