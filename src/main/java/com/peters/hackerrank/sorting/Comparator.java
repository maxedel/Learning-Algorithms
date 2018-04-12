package com.peters.hackerrank.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Comparator {

    class Checker implements java.util.Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            return 0;
        }
    }

    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }


}
