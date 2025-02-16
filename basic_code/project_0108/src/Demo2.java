public class Demo2 {
    public static void main(String[] args) {
        double height = 8844430;
        double height2=0.1;
        int count=0;
        while (height2<=height) {
            height2=height2*2;
            count++;
        }
        System.out.println("the fold times is "+count);
        System.out.println("the final paper height "+height2);
    }
    
}