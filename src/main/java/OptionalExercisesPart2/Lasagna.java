package OptionalExercisesPart2;

public class Lasagna {
    final int ovenLasagnaTime = 40;


    public int expectedMinutesInOven() {
        return ovenLasagnaTime;
    }

    public int remainingMinutesInOven(int minuteInOven) {
        int remainMinutes = expectedMinutesInOven() - minuteInOven;
        return remainMinutes;
    }

    public int preparationTimeMinutes(int numberOfLayers) {
        int spentPreparing = numberOfLayers * 2;
        return spentPreparing;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes) {
        int totalTime = preparationTimeMinutes(numberOfLayers) + remainingMinutesInOven(numberOfMinutes);
        return totalTime;
    }


    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("total time in Minutes = " + lasagna.totalTimeInMinutes(3,20));
    }
}
