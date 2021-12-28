public class ClockTestDrive {
    public static void main(String [] args) {
        Clock c = new Clock();
        c.setTime(-5);
            int tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
