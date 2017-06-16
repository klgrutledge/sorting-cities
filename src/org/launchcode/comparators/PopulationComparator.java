package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Krysta on 6/15/17.
 */
public class PopulationComparator implements Comparator<City> {
    public int compare(City o1, City o2) {
        return Double.compare(o1.getPopulation(), o2.getPopulation());
    }
}
