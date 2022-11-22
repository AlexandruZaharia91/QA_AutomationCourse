package OptionalExercisesPart2;

public class Lasagna {
    final int ovenLasagnaTime = 40;


    public int expectedMinutesInOven() {
        return ovenLasagnaTime;
    }

    public int remainingMinutesInOven(int minuteInOven) {
        return expectedMinutesInOven() - minuteInOven;
    }

    public int preparationTimeMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes) {
        return preparationTimeMinutes(numberOfLayers) + remainingMinutesInOven(numberOfMinutes);
    }


    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("total time in Minutes = " + lasagna.totalTimeInMinutes(3,20));
    }
}
