public class Switches {

    public static void main(String[] args) {

        String seasons = "Sep";
        switch (seasons) {
            case "Dec", "Jan", "Feb" -> System.out.println("Winter");
            case "Mar", "Apr", "May" -> System.out.println("Spring");
            case "Jun", "Jul", "Aug" -> System.out.println("Summer");
            case "Sep", "Oct", "Nov" -> System.out.println("Autumn");
            default -> System.out.println("Not a valid month");
        }
    }

}
