package com.javalearnings.Map;
import java.util.*;

public class Populations {
    public static void main(String[] args) {

        SortedMap<String, Long> countryPopulations = new TreeMap<>();


        countryPopulations.put("China", 1439323776L);
        countryPopulations.put("India", 1380004385L);
        countryPopulations.put("United States", 331002651L);
        countryPopulations.put("Indonesia", 273523615L);
        countryPopulations.put("Pakistan", 220892340L);


        String country = "India";
        System.out.println("Population of " + country + ": " + countryPopulations.get(country));


        System.out.println("Country Populations:");
        for (Map.Entry<String, Long> entry : countryPopulations.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " people");
        }


        String searchCountry = "United States";
        if (countryPopulations.containsKey(searchCountry)) {
            System.out.println(searchCountry + " is present in the SortedMap.");
        } else {
            System.out.println(searchCountry + " is not present in the SortedMap.");
        }


        String removeCountry = "China";
        if (countryPopulations.containsKey(removeCountry)) {
            countryPopulations.remove(removeCountry);
            System.out.println(removeCountry + " has been removed from the SortedMap.");
        } else {
            System.out.println(removeCountry + " is not present in the SortedMap.");
        }


        System.out.println("Size of the SortedMap: " + countryPopulations.size());
    }

}
