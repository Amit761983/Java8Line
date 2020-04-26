package org.interfaceDemo;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public interface CustomCalculator {

    default int addEvenNumber(int... nums)
    {
        return add(n -> n%2==0,nums);
    }

    default int addOddNumber(int... nums)
    {
        return add(n ->n%2==1,nums);
    }

    private int add(IntPredicate predicate,int... nums)
    {
        return IntStream.of(nums)
                .filter(predicate)
                .sum();
    }

}
