class Abstract1{
        public static void main(String[] args) {
            MySmartphone ms=new MySmartphone();
            String[] ls =ms.getNetworks();
            for (String tarun : ls) {
                System.out.println(tarun);
            }
        }
}
interface  MyCamera{
    void takesnap();
    void recordvideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class Mycellphone{
    void callNumber(int phonenumber){
        System.out.println("calling...."+phonenumber);
    }
    void pickup(){
        System.out.println("connecting....");
    }
}
class MySmartphone extends Mycellphone implements MyCamera,MyWifi{
    public void takesnap(){
        System.out.println("Taking snap..");
    }
    public void recordvideo(){
        System.out.println("recording the video..");
    }
    public String[] getNetworks(){
        System.out.println("getting the network list....");
        String[] networks={"tarun","jagan","balu","keshava"};
        return networks;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+network);
    }

}