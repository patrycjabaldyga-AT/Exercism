import java.util.ArrayList;
import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];

    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {

        return Arrays.stream(birdsPerDay)
                .anyMatch(element -> element == 0);

    }

    public int getCountForFirstDays(int numberOfDays) {

        int sum;
        for (int i = 0; i < numberOfDays; i++) {
            sum =+ birdsPerDay[i];
            return sum;
        }
        return 0;
    }

    public int getBusyDays() {

        ArrayList<Integer> correctLength = new ArrayList<>();

        for (int element : birdsPerDay){
            if (element >= 5){
                correctLength.add(element);
            }
        }
    return correctLength.size();
    }
}
