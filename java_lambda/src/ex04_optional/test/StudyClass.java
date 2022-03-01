package ex04_optional.test;

import java.util.Optional;

public class StudyClass {
    private Integer id;
    private String title;
    private Boolean ended;// 완강했는지

    // 학습 진행 정도
    public Progress progress;

//    public Progress getProgress() {
//        return progress;
//    }

    // Optional은 리턴타입에만 쓰도록 권장한다.
    public Optional<Progress> getProgress() {
        //ofNullable는 null 또는 not null일 수 있다는 의미
        // 즉, null일 수 있는 값은 ofNullable로 감싸준다.
        return Optional.ofNullable(progress);

        // of는 null이 아닌 것만 올 수 있다. 즉, progress는 null이 아니라는 의미
//        return Optional.of(progress);
    }

    public StudyClass(Integer id, String title, Boolean ended) {
        this.id = id;
        this.title = title;
        this.ended = ended;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getEnded() {
        return ended;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
}
