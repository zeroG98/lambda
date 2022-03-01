package ex01_lambda;

public class Lambda02 {
    public static void main(String[] args) {
        // 익명 내부 클래스(anonymous inner class)
//        LambdaDemo demo = new LambdaDemo() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello World!!");
//            }
//        };
//        LambdaDemo demo = () -> System.out.println("Hello World!!");

        LambdaDemo demo = () -> {
            System.out.println("Hello World!!");
            System.out.println("Hi");
        };

        demo.doIt();
    }
}
