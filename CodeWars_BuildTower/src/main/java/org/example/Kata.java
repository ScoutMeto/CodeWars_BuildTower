package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static String[] towerBuilder(int nFloors) {

        List<String> floorAppearance = new ArrayList<>(nFloors);

        int numberOfStarsInLastRow = (nFloors*2)-2;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= numberOfStarsInLastRow; i++){
                sb.append("*");
        }

        String starsInLastRow = sb.toString();

        floorAppearance.add(0, starsInLastRow);

        for (int i = 0; i <= nFloors-2; i++) {

            StringBuilder original = new StringBuilder(floorAppearance.get(i));
            original.setCharAt(i, ' ');
            original.setCharAt((nFloors*2)-i-2, ' ');
            floorAppearance.add(i+1, String.valueOf(original));

            if (nFloors == i) {

            }

        }

        Collections.reverse(floorAppearance);

        String collect = floorAppearance.stream().collect(Collectors.joining(",\n ", "[\n", "\n]"));
        System.out.println(collect);

        return floorAppearance.toArray(new String[0]);

    }
}

