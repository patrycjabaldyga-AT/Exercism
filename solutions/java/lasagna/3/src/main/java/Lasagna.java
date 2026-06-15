public class Lasagna {
    public static int expectedMinutesInOven() {
        int expectedTimeInOven = 40;
        return expectedTimeInOven;
    }
    public static int remainingMinutesInOven(int actualMinutesInOven){
        int remainingTimeInOven = expectedMinutesInOven() - actualMinutesInOven;
        return remainingTimeInOven;
    }
    public static int preparationTimeInMinutes(int numberOfLayers){
        int preparationTime = numberOfLayers * 2;
        return preparationTime;
    }

    public static int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int totalTime = preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
        return totalTime;
    }
}
