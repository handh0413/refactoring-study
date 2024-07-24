package jace.refactoring_study.chapter01.ex06;

public class RegularPrice extends Price {
    
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
