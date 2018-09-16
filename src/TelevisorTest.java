import java.sql.SQLOutput;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor testTv = new Televisor(false);

        testTv.showStatus();
        testTv.turnOn();
        testTv.showStatus();
        testTv.turnOff();
        testTv.showStatus();

    }
}
