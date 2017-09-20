public class TelevisorTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor(false);
        tv.showStatus();
        tv.turnON();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }
}
