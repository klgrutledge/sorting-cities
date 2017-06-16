package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Krysta on 6/15/17.
 */
public class AreaComparator implements Comparator<City> {

    public int compare(City o1, City o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}
