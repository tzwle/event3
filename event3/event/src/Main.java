import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Event Management System!");
            System.out.println("Select the type of event:");
            System.out.println("1. Conference Event");
            System.out.println("2. Music Concert Event");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Enter the event ID:");
                String eventID = scanner.nextLine();
                System.out.println("Enter the event name:");
                String eventName = scanner.nextLine();
                System.out.println("Enter the event location:");
                String eventLocation = scanner.nextLine();
                System.out.println("Enter the event point of contact:");
                String eventPointOfContact = scanner.nextLine();
                System.out.println("Enter the event cost:");
                double eventCost = scanner.nextDouble();
                System.out.println("Enter the total participants:");
                int totalParticipants = scanner.nextInt();
                System.out.println("Enter the total event days:");
                int totalEventDays = scanner.nextInt();
                System.out.println("Is breakfast required? (true/false)");
                boolean breakfastRequired = scanner.nextBoolean();
                System.out.println("Enter the breakfast cost:");
                double breakfastCost = scanner.nextDouble();
                System.out.println("Is lunch required? (true/false)");
                boolean lunchRequired = scanner.nextBoolean();
                System.out.println("Enter the lunch cost:");
                double lunchCost = scanner.nextDouble();
                System.out.println("Is dinner required? (true/false)");
                boolean dinnerRequired = scanner.nextBoolean();
                System.out.println("Enter the dinner cost:");
                double dinnerCost = scanner.nextDouble();
                ConferenceEvent conferenceEvent = new ConferenceEvent(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays, breakfastRequired, breakfastCost, lunchRequired, lunchCost, dinnerRequired, dinnerCost);
                conferenceEvent.calculateEventCost();
                System.out.println(conferenceEvent.toString());
            } else if (choice == 2) {
                System.out.println("Enter the event ID:");
                String eventID = scanner.nextLine();
                System.out.println("Enter the event name:");
                String eventName = scanner.nextLine();
                System.out.println("Enter the event location:");
                String eventLocation = scanner.nextLine();
                System.out.println("Enter the event point of contact:");
                String eventPointOfContact = scanner.nextLine();
                System.out.println("Enter the event cost:");
                double eventCost = scanner.nextDouble();
                System.out.println("Enter the total participants:");
                int totalParticipants = scanner.nextInt();
                System.out.println("Enter the total event days:");
                int totalEventDays = scanner.nextInt();
                System.out.println("Is merchandise required? (true/false)");
                boolean merchandiseRequired = scanner.nextBoolean();
                System.out.println("Enter the merchandise cost:");
                double merchandiseCost = scanner.nextDouble();
                MusicConcertEvent musicConcertEvent = new MusicConcertEvent(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants,totalEventDays, merchandiseRequired, merchandiseCost);
                musicConcertEvent.calculateEventCost();
                System.out.println(musicConcertEvent.toString());
            }
        }
    }
}
