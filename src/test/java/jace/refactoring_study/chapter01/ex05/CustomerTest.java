package jace.refactoring_study.chapter01.ex05;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    void regular_movie_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t2.0
                Amount owed is 2.0
                You earned 1 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void regular_movie_html_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 2.0</br>
                <p>You owe <em>2.0</em></p>
                On this rental you earned <em>1</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void regular_movie_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.REGULAR);
        Rental rental = new Rental(movie, 5);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t6.5
                Amount owed is 6.5
                You earned 1 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void regular_movie_html_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.REGULAR);
        Rental rental = new Rental(movie, 5);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 6.5</br>
                <p>You owe <em>6.5</em></p>
                On this rental you earned <em>1</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void new_release_movie_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t3.0
                Amount owed is 3.0
                You earned 1 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void new_release_movie_html_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 3.0</br>
                <p>You owe <em>3.0</em></p>
                On this rental you earned <em>1</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void new_release_movie_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t6.0
                Amount owed is 6.0
                You earned 2 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void new_release_movie_html_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 6.0</br>
                <p>You owe <em>6.0</em></p>
                On this rental you earned <em>2</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void children_movie_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.CHILDREN);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t1.5
                Amount owed is 1.5
                You earned 1 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void children_movie_html_test01() {
        // given
        Movie movie = new Movie("MovieA", Movie.CHILDREN);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 1.5</br>
                <p>You owe <em>1.5</em></p>
                On this rental you earned <em>1</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void children_movie_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.CHILDREN);
        Rental rental = new Rental(movie, 4);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t3.0
                Amount owed is 3.0
                You earned 1 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void children_movie_html_test02() {
        // given
        Movie movie = new Movie("MovieA", Movie.CHILDREN);
        Rental rental = new Rental(movie, 4);
        Customer customer = new Customer("CustomerA");
        customer.addRental(rental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 3.0</br>
                <p>You owe <em>3.0</em></p>
                On this rental you earned <em>1</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void all_movie_test01() {
        // given
        Movie regularMovie = new Movie("MovieA", Movie.REGULAR);
        Rental regularMovieRental = new Rental(regularMovie, 2);

        Movie newReleaseMovie = new Movie("MovieB", Movie.NEW_RELEASE);
        Rental newReleaseMovieRental = new Rental(newReleaseMovie, 1);

        Movie childrenMovie = new Movie("MovieC", Movie.CHILDREN);
        Rental childrenMovieRental = new Rental(childrenMovie, 3);

        Customer customer = new Customer("CustomerA");
        customer.addRental(regularMovieRental);
        customer.addRental(newReleaseMovieRental);
        customer.addRental(childrenMovieRental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t2.0
                \tMovieB\t3.0
                \tMovieC\t1.5
                Amount owed is 6.5
                You earned 3 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void all_movie_html_test01() {
        // given
        Movie regularMovie = new Movie("MovieA", Movie.REGULAR);
        Rental regularMovieRental = new Rental(regularMovie, 2);

        Movie newReleaseMovie = new Movie("MovieB", Movie.NEW_RELEASE);
        Rental newReleaseMovieRental = new Rental(newReleaseMovie, 1);

        Movie childrenMovie = new Movie("MovieC", Movie.CHILDREN);
        Rental childrenMovieRental = new Rental(childrenMovie, 3);

        Customer customer = new Customer("CustomerA");
        customer.addRental(regularMovieRental);
        customer.addRental(newReleaseMovieRental);
        customer.addRental(childrenMovieRental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 2.0</br>
                MovieB: 3.0</br>
                MovieC: 1.5</br>
                <p>You owe <em>6.5</em></p>
                On this rental you earned <em>3</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void all_movie_test02() {
        // given
        Movie regularMovie = new Movie("MovieA", Movie.REGULAR);
        Rental regularMovieRental = new Rental(regularMovie, 3);

        Movie newReleaseMovie = new Movie("MovieB", Movie.NEW_RELEASE);
        Rental newReleaseMovieRental = new Rental(newReleaseMovie, 2);

        Movie childrenMovie = new Movie("MovieC", Movie.CHILDREN);
        Rental childrenMovieRental = new Rental(childrenMovie, 4);

        Customer customer = new Customer("CustomerA");
        customer.addRental(regularMovieRental);
        customer.addRental(newReleaseMovieRental);
        customer.addRental(childrenMovieRental);

        // when
        String actual = customer.statement();

        // then
        String expected = """
                Rental Record for CustomerA
                \tMovieA\t3.5
                \tMovieB\t6.0
                \tMovieC\t3.0
                Amount owed is 12.5
                You earned 4 frequent renter points""";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void all_movie_html_test02() {
        // given
        Movie regularMovie = new Movie("MovieA", Movie.REGULAR);
        Rental regularMovieRental = new Rental(regularMovie, 3);

        Movie newReleaseMovie = new Movie("MovieB", Movie.NEW_RELEASE);
        Rental newReleaseMovieRental = new Rental(newReleaseMovie, 2);

        Movie childrenMovie = new Movie("MovieC", Movie.CHILDREN);
        Rental childrenMovieRental = new Rental(childrenMovie, 4);

        Customer customer = new Customer("CustomerA");
        customer.addRental(regularMovieRental);
        customer.addRental(newReleaseMovieRental);
        customer.addRental(childrenMovieRental);

        // when
        String actual = customer.htmlStatement();

        // then
        String expected = """
                <h1>Rentals for <em>CustomerA</em></h1><p>
                MovieA: 3.5</br>
                MovieB: 6.0</br>
                MovieC: 3.0</br>
                <p>You owe <em>12.5</em></p>
                On this rental you earned <em>4</em> frequent renter points</p>""";
        assertThat(actual).isEqualTo(expected);
    }
}