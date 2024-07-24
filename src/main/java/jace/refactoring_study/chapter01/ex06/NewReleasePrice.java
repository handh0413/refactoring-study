package jace.refactoring_study.chapter01.ex06;

public class NewReleasePrice extends Price {
    
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
