  public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names using StringBuilder
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}