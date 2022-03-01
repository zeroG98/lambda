package ex01_lambda;

import java.util.function.*;

public class Lambda03 {
    public static void main(String[] args) {
        LambdaDemo02 demo02 = number -> number + 100;
        System.out.println(demo02.doIt(10));

        /*** 자바에서 제공하는 함수형 인터페이스 이용해서 처리하기 ***/
//        Function<Integer, Integer> twoTimes = number -> number*2;
////        Function<Integer, Integer> twoTimes = (number) -> number*2;
//        System.out.println("Function : "+twoTimes.apply(100));

        // 함수형 인터페이스를 구현한 클래스를 만들어서 사용하기
        TwoTimes twoTimes = new TwoTimes();
        System.out.println("Function 클래스 : " + twoTimes.apply(100));

        // 리턴값이 없이 함수만 소비하는 함수형 인터페이스
        // 노란색 표시는 메서드 레퍼런스(::) 형식으로 사용하라는 intellij의 메시지
//        Consumer<Integer> printT = (i) -> System.out.println(i);
        Consumer<Integer> printT = System.out::println;
        printT.accept(10);

        BiFunction<String, String, Integer> biFunction = (s, u) -> s.length() + u.length();
        System.out.println("bi function : "+biFunction.apply("First", "Second"));

        // 입력값과 리턴값이 같을 때 사용하는 함수형 인터페이스
        // Function<Integer, Integer>
        UnaryOperator<Integer> addInt = (i) -> i + 100;
        System.out.println("UnaryOperator : " + addInt.apply(20));

        // 입력값 없이 결과값을 얻어오는 함수형 인터페이스
        Supplier<Integer> getInt = () -> 1000;
        System.out.println("Supplier : " + getInt.get());
    }
}
