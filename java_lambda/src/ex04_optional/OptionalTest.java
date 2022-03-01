package ex04_optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> good = Optional.of("good");
        String s = good.get();
        System.out.println("optional value : " + s);

        Optional<Object> empty = Optional.empty();
        System.out.println("empty : " + empty);

        Optional<String> lg = Optional.ofNullable("lg");
        String s1 = lg.get();
        System.out.println("optional lg value : " + lg);
        System.out.println("optional s1 value : " + s1);

        Optional<Object> o = Optional.ofNullable(null);
        System.out.println("optional value : "+ o);

//        NullPointerException
//        Optional<Object> o1 = Optional.of(null);
//        System.out.println(o1);

        boolean good1 = Optional.ofNullable("good").isPresent();
        System.out.println("값 존재 : "+ good1);

        boolean good2 = Optional.ofNullable(null).isPresent();
        System.out.println("값 존재 : "+ good2);

        boolean kakao = Optional.ofNullable("Kakao").isEmpty();
        System.out.println("비어있는가 : " + kakao);

        boolean empty1 = Optional.ofNullable(null).isEmpty();
        System.out.println("비어있는가 : " + empty1);
    }
}
