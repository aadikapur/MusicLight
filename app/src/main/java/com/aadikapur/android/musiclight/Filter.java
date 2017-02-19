package com.aadikapur.android.musiclight;

import java.util.ArrayList;
import java.util.Arrays;

public class Filter {

    private ArrayList<Integer> highs;
    private ArrayList<Integer> filteredHighs;
    private ArrayList<Boolean> p1;
    private ArrayList<Boolean> p2;
    private ArrayList<Boolean> p3;


    void Filter() {
        highs = new ArrayList(
                Arrays.asList(867, 1156, 1148, 1140, 1113, 1085, 1062, 1038, 1022, 1007, 1000, 993, 977, 961, 943, 924, 907, 889, 878, 867, 898, 928, 990, 1052, 1103, 1153, 1135, 1117, 1072, 1027, 996, 965, 948, 930, 919, 908, 906, 905, 907, 910, 918, 926, 925, 924, 959, 993, 1003, 1013, 1025, 1036, 989, 942, 921, 899, 885, 871, 872, 874, 862, 851, 835, 820, 809, 798, 795, 791, 812, 833, 873, 912, 954, 995, 1002, 1009, 986, 963, 943, 922, 901, 880, 866, 852, 846, 840, 833, 826, 838, 849, 856, 863, 885, 906, 946, 985, 1011, 1038, 1051, 1064, 1020, 976, 946, 916, 889, 861, 841, 821, 805, 789, 775, 760, 752, 743, 733, 723, 718, 713, 708, 703, 698, 693, 687, 682, 676, 670, 665, 661, 656, 652, 647, 643, 641, 638, 634, 630, 626, 623, 620, 618, 618, 617, 616, 615, 613, 612, 610, 608, 607, 606, 605, 605, 604, 603, 603, 603, 602, 602, 601, 600, 600, 599, 598, 598, 598, 597, 597, 596, 595, 594, 593, 593, 592, 592, 591, 591, 591, 591, 591, 591, 590, 590, 590, 589, 589, 589, 588, 588, 587, 587, 586, 586, 585, 585, 584, 584, 583, 583, 583, 582, 582, 582, 582, 581, 581, 581, 580, 580, 580, 580, 580, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579, 579,
                        579));

        filteredHighs = new ArrayList<Integer>();
        boolean isLargest = true;
        int max = 1;
        int min = 1000;

        for (int i = 5; i < highs.size() - 6; i++) {
            isLargest = true;
            for (int j = 3; j <= 3; j++) {
                if (highs.get(i - j) > highs.get(i) || highs.get(i + j) > highs.get(i))
                    isLargest = false;
            }
            if (isLargest == true) {
                filteredHighs.add(highs.get(i));
                if (highs.get(i) > max)
                    max = highs.get(i);
                if (highs.get(i) < min)
                    min = highs.get(i);
            }
        }

        int range = max - min;
        int lowerThird = min + range / 3;
        int higherThird = min + ((range * 2) / 3);
        int lowerThirdNumber = 0;
        int higherThirdNumber = 0;
        for (int i = 0; i < filteredHighs.size(); i++) {
            if (filteredHighs.get(i) < lowerThird)
                lowerThirdNumber++;
            if (filteredHighs.get(i) > higherThird)
                higherThirdNumber++;
        }
        p1 = new ArrayList<Boolean>();
        p2 = new ArrayList<Boolean>();
        p3 = new ArrayList<Boolean>();


        //Creates flashlight file
        for (int i = 0; i < highs.size(); i++) {
            for (int j = 0; j < filteredHighs.size(); j++) {
                if (highs.get(i) == filteredHighs.get(j)) {
                    if (highs.get(i) < lowerThird){
                        p1.add(true);
                        p2.add(false);
                        p3.add(false);
                    }
                    else if (highs.get(i) > lowerThird && highs.get(i) < higherThird)
                }
            }
        }
    }
}