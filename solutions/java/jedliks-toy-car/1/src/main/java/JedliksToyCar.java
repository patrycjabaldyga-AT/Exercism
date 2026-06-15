public class JedliksToyCar {

    private int meters = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {

        if (battery == 0){
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {

        if (meters >= 2000){
            meters = 2000;
            return;
        }else {
            meters += 20;
        }

        if (battery < 1){
            battery = 0;
        } else {
            battery -= 1;
        }
    }
}
