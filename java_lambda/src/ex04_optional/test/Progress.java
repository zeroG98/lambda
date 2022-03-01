package ex04_optional.test;

import java.time.Duration;

public class Progress {
    private Duration studyDuration; // 학습진행정도

    private boolean finished; // 완주했는지 여부

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }
}
