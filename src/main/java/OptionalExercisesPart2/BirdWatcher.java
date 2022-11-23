package OptionalExercisesPart2;

import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birds = new BirdWatcher(birdsPerDay);
        System.out.println("getlastweek birds: " + Arrays.toString(birds.getLastWeek()));
        System.out.println("number of birds for today: " + birds.getToday());
        birds.incrementTodaysCount();
        System.out.println("add a new bird for today: " + Arrays.toString(birds.birdsPerDay));
        System.out.println("days without birds: " + birds.hasDayWithoutBirds());
        System.out.println("number of birds for 4 days: " + birds.getCountForFirstDays(4));
        System.out.println("days with 5 or more than 5 birds per day: " + birds.getBusyDays());
    }

    public int[] getLastWeek() {
        int[] getLastWeekBirds = {3, 2, 4, 1, 5, 10, 2};
        return getLastWeekBirds;
    }

    public int getToday() {
        int birdNumberToday = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (i == birdsPerDay.length - 1) {
                birdNumberToday = birdsPerDay[i];
            }
        }
        return birdNumberToday;
    }


    public void incrementTodaysCount() {
        for (int j = 0; j < birdsPerDay.length; j++) {
            if (j == birdsPerDay.length - 1) {
                birdsPerDay[j] += 1;
            }
        }
    }

    public boolean hasDayWithoutBirds() {
        boolean dayswithoutBirds = false;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                dayswithoutBirds = true;
            }
        }
        return dayswithoutBirds;
    }


    public int getCountForFirstDays(int days) {
        int i = 0;
        int getNumberOfBirds = 0;
        while (i < days) {
            getNumberOfBirds = getNumberOfBirds + birdsPerDay[i];
            i++;
        }
        return getNumberOfBirds;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }


}
