package jace.refactoring_study.chapter01.ex04;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        Enumeration<Rental> enumeration = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (enumeration.hasMoreElements()) {
            Rental each = enumeration.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration<Rental> enumeration = this.rentals.elements();
        String result = "<h1>Rentals for <em>" + getName() + "</em></h1><p>\n";
        while (enumeration.hasMoreElements()) {
            Rental each = enumeration.nextElement();
            // show figures for this rental
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "</br>\n";
        }
        // add footer lines
        result += "<p>You owe <em>" + getTotalCharge() + "</em></p>\n";
        result += "On this rental you earned <em>" + getTotalFrequentRenterPoints() + "</em> frequent renter points</p>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> enumeration = rentals.elements();
        while (enumeration.hasMoreElements()) {
            Rental each = enumeration.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> enumeration = rentals.elements();
        while (enumeration.hasMoreElements()) {
            Rental each = enumeration.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
