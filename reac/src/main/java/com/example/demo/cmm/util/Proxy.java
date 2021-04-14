package com.example.demo.cmm.util;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.example.demo.bbs.domain.Article;
import com.example.demo.bbs.domain.Board;
import com.example.demo.uss.domain.User;

import org.springframework.stereotype.Component;

@Component
public class Proxy {
    public static Consumer<String> print = System.out::print;
    public static Function<Object,String> string = String::valueOf;
    public static Function<Integer,String> instring = String::valueOf;

    public static Function<Double,Double> absNum = Math::abs;
    public static Function<Double,Double> ceiNum = Math::ceil;
    public static Function<Double,Double> floNum = Math::floor;
    public static BiFunction<Integer,Integer,Integer> bigOne = Math::max; 
    public static BiFunction<Integer,Integer,Integer> smOne = Math::min;
    public static Supplier<Double> ranOne = Math::random;
    public static Function<Double,Double> cloOne = Math::rint;
    public static Function<Double,Long> loOne = Math::round;

    public static Supplier<User> newUser = User::new;
    public static Supplier<Article> newArticle = Article::new;
    public static Supplier<Board> newBoard = Board::new;
}
