package ex01_lambda;

// 이 어노테이션은 메소드 추가시 컴파일 에러 발생
// 메소드 추가를 방지, 함수형 인터페이스를 견고하게 만들어주는 역할
@FunctionalInterface
public interface LambdaDemo {
    void doIt();
//    void dotIt2(); // 컴파일 에러
}
