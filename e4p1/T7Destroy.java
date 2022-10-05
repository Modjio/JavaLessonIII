package e4p1;

public class T7Destroy {

    public static void main(String[] args) {
        printMessage(new ItsMessage());
    }

    public static class ItsMessage {
        private static String message = "floor";

        public String getDescription() {
            return message;
        }
    }

    public static void printMessage(ItsMessage itsMessage) {
        System.out.println(itsMessage.getDescription());
    }
}
