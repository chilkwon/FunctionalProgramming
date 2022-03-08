package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStream {

    @Test
    void streams(){
        List<String> names = List.of("chil","yun","kevin","michale");
        Stream<String> stream = names.stream();

        long collect = stream.limit(2).map(null).sorted(null).dropWhile(null)
                .count();

        String[] namesArray = {""};


    }
}
