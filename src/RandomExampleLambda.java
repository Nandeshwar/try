
public class RandomExampleLambda {
    public static void main(String[] args) {

        // new way
        Interface1 interface1 = (int a, int b) -> {
            System.out.println(a);
            System.out.println(b);
        };

        interface1.sum(10, 20);

        // old way
        Interface1 interface11 = new Interface1 (){
            public void sum(int a, int b) {
                System.out.println(a);
                System.out.println(b);
            }
        };
        interface11.sum(20, 30);
    }
}

@FunctionalInterface
interface Interface1 {
    void sum(int a, int b);
}
