package edu.cscc;

/**
 * @author Md Basher
 * Date: 12/01/2019
 * ProjectName: CSCI-2467 Lab 13 – Java Collections - Maps
 * The loadCensusData() method in the Census class will change as follows:
 * 1)	It will return a Map collection.
 * 2)	Instead of creating an array to store an array of Surname elements, create a HashMap  object.
 * 3)	Instead of reading in the first one hundred surnames, you will read them all.
 * 4)	As before, you will create and initialize Surname objects.
 * 5)	For each line in the file (except the header line), you’ll add a key / value pair to the HashMap.
 * The key is the surname string, and the value is the Surname object.
 * 6)	The method will return the populated HashMap.
 */
public class Surname {
    // Declared all the necessary variables...
    private String name;
    private int rank;
    private int count;
    private double proportion;

    /**
     * Constructor Added here...
     *
     * @param name       - takes sting names value...
     * @param rank       - takes integer as the ranks values...
     * @param count      -  takes integer values...
     * @param proportion - takes double values ...
     */
    public Surname(String name, int rank, int count, double proportion) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.proportion = proportion;
    }

    // Getters & setters Added respectively...

    /**
     * getName() - method implemented here...
     *
     * @return name - the string name...
     */
    public String getName() {
        return name;
    }

    /**
     * setName() - method takes the names...     *
     * @param name - takes name as  string values ...
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getRank() - method implemented here to spit out the rank...
     *
     * @return - spit out the rank...
     */
    public int getRank() {
        return rank;
    }

    /**
     * setRank()- method takes integer values for the rank...
     *
     * @param rank - takes the rank value in integer...
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * getCount() - method spit out the values for count...
     *
     * @return - it returns the count integer...
     */
    public int getCount() {
        return count;
    }

    /**
     * setCount() - method takes the values...
     *
     * @param count - takes the count values...
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * getProportion() - method get the double values...
     *
     * @return - spit out the double values for proportion varaiable...
     */
    public double getProportion() {
        return proportion;
    }

    /**
     * setProportion() - method takes the double values for the proportion variable...
     *
     * @param proportion - takes proportion values...
     */
    public void setProportion(double proportion) {
        this.proportion = proportion;
    }
}