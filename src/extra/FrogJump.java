package extra;

public class FrogJump {

    public static int frog(int n) {
        int f1=1;
        int f2=2;
        int f3=0;
 
        for (int i = 3; i <=n ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
 
    public static void main(String[] args) {
        System.out.println(frog(3));
        System.out.println(frog(4));
        System.out.println(frog(5));
        System.out.println(frog(6));
    }

}
