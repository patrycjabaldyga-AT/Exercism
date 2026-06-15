public class CarsAssemble {

    double carHundredPercentProductionPerHour = 221;
    double carNintyPercentProduction = carHundredPercentProductionPerHour * 0.90;
    double carEightyPercentProduction = carHundredPercentProductionPerHour * 0.80;
    double carSeventySevenPercentProduction = carHundredPercentProductionPerHour * 0.77;

    public double productionRatePerHour(int speed) {
//        throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");

        if (speed <= 4) {
            return carHundredPercentProductionPerHour * speed;
        } else if (speed <= 8) {
            return carNintyPercentProduction * speed;
        } else if (speed == 9) {
            return carEightyPercentProduction * speed;
        } else if (speed == 10) {
            return carSeventySevenPercentProduction * speed;
        } else {
            return 0.00;
        }

    }

    public int workingItemsPerMinute(int speed) {
//        throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");

        int carsPerMinute;

        if (speed == 0) {
            carsPerMinute = 0;
            return carsPerMinute;
        } else if (speed <= 4) {
            carsPerMinute = (int) (carHundredPercentProductionPerHour * speed) / 60;
            return carsPerMinute;
        } else if (speed <= 8) {
            carsPerMinute = (int) (carNintyPercentProduction * speed) / 60;
            return carsPerMinute;
        } else if (speed == 9) {
            carsPerMinute = (int) (carEightyPercentProduction * speed) / 60;
            return carsPerMinute;
        } else if (speed == 10) {
            carsPerMinute = (int) (carSeventySevenPercentProduction * speed) / 60;
        } else {
            return 0;
        }

        return carsPerMinute;
    }
}
