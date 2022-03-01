package ex03_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림(Stream)의 특징
// 중간형 operator는 리턴이 stream
// 종료형 operator가 오기전까지는 실행이 안된다.
// 원본 자료형은 변화지 않는다.

public class StreamEx {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("조선");
        strList.add("반도체");
        strList.add("휴대폰");
        strList.add("자동차");

//        strList.stream().forEach(i -> System.out.print(i + " "));
        strList.stream().sorted().forEach(i -> System.out.print(i + " "));
        System.out.println();

        String[] strArray = {"apple", "banana", "cherry", "dekopon"};
        // 배열을 리스트로 변환
        List<String> cvtStrList = Arrays.asList(strArray);
        cvtStrList.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("==============");

        Stream<String> stream01 = Stream.of(strArray);
        stream01.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> stream02 = Stream.of("LG", "Samsung", "SK", "Lotte", "Naver");
        stream02.forEach(i -> System.out.print(i + " "));
        System.out.println();

//        IntStream intStream = IntStream.range(1, 8);
        IntStream intStream = IntStream.rangeClosed(1, 8);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        DoubleStream doubleStream = DoubleStream.of(0.23, 0.1212, 1.232323, 3.3434);
        doubleStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<String> originStream = Stream.of("samsung", "hyndai", "sk", "lotte")
                .filter(i -> !i.isEmpty())
                .filter(i->!i.startsWith("h"));
        originStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        String[] strArray02 = {"Math", "Science", "English", "Korea", "English"};
        Stream<String> strStreamOrigin = Stream.of(strArray02);
        strStreamOrigin.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("===============");
        Stream<String> strStreamDistince = Stream.of(strArray02).distinct();
        strStreamDistince.forEach(i -> System.out.print(i + " "));
        System.out.println();

        String[] strArray03 = {"한국", "미국", "한국", "러시아", "중국", "일본", "대한민국"};
        Set<String> collect = Stream.of(strArray03).collect(Collectors.toSet());
        System.out.println(collect);

        List<String> collect2 = Stream.of(strArray03).collect(Collectors.toList());
        System.out.println(collect2);

        ArrayList<String> names = new ArrayList<>();
        names.add("kim");
        names.add("lee");
        names.add("park");
        names.add("choi");

        System.out.println("===========");
        // 스트림을 사용하지 않고 기존처럼 사용예
//        for (String name : names) {
//            System.out.println(name.toUpperCase());
//        }

        // Stream이 실행되지 않음. stream을 리턴 ? 최종 operator가 없기 때문
        Stream<String> stringStream = names.stream().map(s -> s.toUpperCase());
        stringStream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        names.forEach(s-> System.out.print("원본소스 : " + s + " "+"\n"));

        System.out.println("===========");

//        for (String name : names) {
//            if(name.startsWith("p")){
//                System.out.println(name.toUpperCase());
//            }
//        }
        Stream<String> stringStream2 = names.stream()
                .filter(s -> s.startsWith("p"))
                .map(String::toUpperCase);

        stringStream2.forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("----------");




        List<String> collect3 = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

//        collect3.forEach(i -> System.out.print(i + " "));
        collect3.forEach(System.out::print); // 메소드 레퍼런스
    }
}
