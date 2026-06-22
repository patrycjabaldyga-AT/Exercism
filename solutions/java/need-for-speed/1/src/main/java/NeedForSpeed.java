class NeedForSpeed {

    int speed;
    int batteryDrain;
    int distanceDriven;
    int battery;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery <= 0 || batteryDrain > battery;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {

        if (batteryDrained()){
            return;
        } else {
            battery -= batteryDrain;
            distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        int speed = 50;
        int batteryDrain = 4;
        return new NeedForSpeed(speed,batteryDrain);
    }
}

class RaceTrack {

    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int availableDistance = car.battery / car.batteryDrain;
        int maxDistance = availableDistance * car.speed;

        if (car.batteryDrained()) {
            return false;
        }

        return maxDistance >= distance;
    }
}
