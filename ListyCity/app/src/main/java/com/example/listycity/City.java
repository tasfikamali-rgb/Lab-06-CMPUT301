package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * Constructs a City with a name and province
     * @param city
     *     City name
     * @param province
     *     Province name
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return
     *     City name
     */
    public String getCityName() {
        return city;
    }

    /**
     * Returns the province name
     * @return
     *     Province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province name
     * @param province
     *     Province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compare cities alphabetically by city name
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks if two City objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;

        City other = (City) obj;
        return city.equals(other.city)
                && province.equals(other.province);
    }
}