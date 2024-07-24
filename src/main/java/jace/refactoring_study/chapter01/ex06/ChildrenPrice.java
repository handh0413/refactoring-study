package jace.refactoring_study.chapter01.ex06;

public class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }
}
