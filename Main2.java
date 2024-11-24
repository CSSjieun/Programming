public class Main2 {
    public static void main(String[] args) {
        int a = 100;
        int n;
        for(n=6; n>0; n--){
            a = wow(a);
            System.out.println("Step " + (7-n) + ": " + a);
        }
    }

    public static int wow(int num) {
        int b = num * 4;
        return b;
    }
}

