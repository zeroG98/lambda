package ex02_method_ref;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

// 람다는 기존의 메소드를 호출
// 메소드 레퍼런스 : 람다의 표현식을 조금 더 간결하게 표현하는 방식
public class MethodReferenceDemo {
    public static void main(String[] args) {
        Function<Integer, String> intToStr = (i) -> "String";

//        UnaryOperator<String> hi = (s) -> "hi " + s;
//        System.out.println(hi.apply("홍길동"));

        // 스태틱 메소드 참조 (타입 :: 스태틱메소드명)
        UnaryOperator<String> hi = Hello::hi;
        String msg = hi.apply("홍길동");
        System.out.println(msg);

        Hello helloInstance = new Hello();
        // 인스턴 메소드 참조(객체명(인스턴스명) :: 인스턴스메소드)
        UnaryOperator<String> hello =  helloInstance::hello;

        // 기본생성자 참조 (타입 :: new)
        Supplier<Hello> newHello = Hello::new;
        Hello hello1 = newHello.get();

        msg = hello1.hello("Kim");
        System.out.println(msg);

        // 인자 생성자 (타입 :: new)
        Function<String, Hello> msgHello = Hello::new;

        Hello jhKim = msgHello.apply("jhKim");
        System.out.println(jhKim.getName());
    }
}
