public class problem49 {
        public static void main(String[] args) {
            int arr[] ={1,5,6,7,6,87,90};
            int sear = 7;
            Boolean b =false;
            for (int i =0;i<arr.length;i++) {
                if(sear == arr[i]){
                    System.out.println("the element "+sear+" is present at "+i+" possition");
                    b=true;
                    break;
                }
                else{
                    b =false;
                }
            }
            if(!b){
                System.out.println("it is not present");
            }
        }
}
