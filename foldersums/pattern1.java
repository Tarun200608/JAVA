class pattern1{
    public static void main(String[] args) {
        int a=10;
        for (int i = 0; i < 2*a-1; i++) {
            for (int j = 0; j < 2*a-1; j++) {
                int top = i;
                int left =j;
                int right =(2*a-1)-1-j;
                int down = (2*a-1)-1-i;
                System.out.print(a-Math.min(Math.min(top,left),Math.min(right,down))+" ");
            }
            System.out.println();
        }
    }
}