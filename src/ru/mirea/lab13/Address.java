package ru.mirea.lab13;

import java.util.StringTokenizer;
public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String addressString, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, delimiters);
        if (tokenizer.hasMoreTokens()) {
            this.country = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.region = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.city = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.street = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.house = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.building = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {this.apartment = tokenizer.nextToken().trim();
        }
    }

    // getters and setters

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (country != null && !country.isEmpty()) {
            sb.append(country);
        }
        if (region != null && !region.isEmpty()) {
            sb.append(", ").append(region);
        }
        if (city != null && !city.isEmpty()) {
            sb.append(", ").append(city);
        }
        if (street != null && !street.isEmpty()) {
            sb.append(", ").append(street);
        }
        if (house != null && !house.isEmpty()) {
            sb.append(", ").append(house);
        }
        if (building != null && !building.isEmpty()) {
            sb.append(", ").append(building);
        }
        if (apartment != null && !apartment.isEmpty()) {
            sb.append(", ").append(apartment);
        }
        return sb.toString();
    }
}