package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * Constructs an empty CityList.
     */
    public CityList() {
        // default constructor
    }

    /**
     * This adds a city to the list if the city does not exist.
     *
     * @param city
     *     This is a candidate city to add.
     * @throws IllegalArgumentException
     *     If the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks whether the given city exists in the list.
     *
     * @param city
     *     City to check.
     * @return
     *     True if the city exists in the list, otherwise false.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     *
     * @param city
     *     City to delete.
     * @throws IllegalArgumentException
     *     If the city does not exist in the list.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     *
     * @return
     *     Number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities.
     *
     * @return
     *     Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
}