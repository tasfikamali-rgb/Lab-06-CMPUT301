package com.example.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();

        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCitiesBehavior() {
        CityList cityList = mockCityList();


        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));


        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);


        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }
    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        assertTrue(cityList.hasCity(mockCity()));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));
    }

    @Test
    void testDeleteRemovesCity() {
        CityList cityList = mockCityList();
        City city = mockCity();

        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
        assertEquals(0, cityList.countCities());
    }

    @Test
    void testDeleteThrowsException() {
        CityList cityList = mockCityList();
        City notInList = new City("Calgary", "Alberta");

        assertThrows(IllegalArgumentException.class, () -> cityList.delete(notInList));
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));
        assertEquals(2, cityList.countCities());
    }
}