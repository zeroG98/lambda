package ex01_lambda;

import java.util.function.Function;

public class TwoTimes implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * 2;
    }
}
