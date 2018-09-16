public class Televisor {
    boolean tvOn;

    Televisor (boolean tvOn) {
        this.tvOn = tvOn;
    }

    void turnOn() {
        tvOn = true;
    }

    void turnOff() {
        tvOn = false;
    }

    void showStatus() {
        System.out.println("Is TV on? " + tvOn);
    }

}
