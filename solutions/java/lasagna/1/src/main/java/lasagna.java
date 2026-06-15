public class Lasagna {
    // Total expected time of lasagne cooking
    public static int expectedMinutesInOven() {
        int expectedTimeInOven = 40;
        return expectedTimeInOven;
    }
    // Remaining time in oven
    public static int remainingMinutesInOven(int actualMinutesInOven){
        int remainingTimeInOven = expectedMinutesInOven() - actualMinutesInOven;
        return remainingTimeInOven;
    }
    // Prep time (each layer takes 2 min to do)
    public static int preparationTimeInMinutes(int numberOfLayers){
        int preparationTime = numberOfLayers * 2;
        return preparationTime;
    }

    // Total time
    public static int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int totalTime = preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
        return totalTime;
    }
}
