package com.kyle.microservices.utils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Kyle on 7/9/2017.
 */
public class ConverterHandler<T, S> {
    public List<T> convertSoap2Object(List<S> list, Function<S, T> convertFun) {
        List<T> localList = list.stream()
                .map(convertFun)
                .collect(Collectors.<T>toList());
        return localList;
    }
}
