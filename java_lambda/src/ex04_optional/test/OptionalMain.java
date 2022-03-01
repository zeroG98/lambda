package ex04_optional.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        StudyClass spring_boot = new StudyClass(1, "spring Boot", true);

        // spring_boot의 학습 진행정도를 알아보기 위한 코드
        // NullPointerException 발생 ? progress값이 null이기 때문에
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration);

//        Progress progress = spring_boot.getProgress();
//        // 이런 방법은 사람이 실수하기 쉬운방법, null체크 하는걸 잊어버릴 수 있다.
//        if (progress != null) {
//            System.out.println(progress.getStudyDuration());
//        }

        Optional<Progress> progress = spring_boot.getProgress();
        // ifPresent는 값이 있을 때 로직이 실행되고, 없으면 실행되지 않는다.
        progress.ifPresent(p -> System.out.println(p.getStudyDuration()));
    }
}
