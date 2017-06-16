package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        CompoundComparator cc = new CompoundComparator();

        NameComparator nameComparator = new NameComparator();
        cities.sort(nameComparator);
        printCities(cities);

        StateComparator stateComparator = new StateComparator();
        cities.sort(stateComparator);
        printCities(cities);

        AreaComparator areaComparator = new AreaComparator();
        cities.sort(areaComparator);
        printCities(cities);

        PopulationComparator populationComparator = new PopulationComparator();
        cities.sort(populationComparator);
        printCities(cities);

        cc.add(nameComparator);
        cc.add(stateComparator);
        cities.sort(cc);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
