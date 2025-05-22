public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(101, "Evelyn", 27);
        System.out.println(customer);

        //Membership class (2 points) exercise. Run code bellow:
        //Ticket ticket = new Ticket(5, 9);
        //The compiler will display an error.

        Ticket ticket = new RegularTicket(201, 101, "Inception", "B7");
        System.out.println(ticket);

        Ticket vipTicket = new VIPTicket(202, 102, "Avatar", "A1", "Free Popcorn");
        System.out.println(vipTicket);

        MovieScreening screening = new MovieScreening("Titanic", "Saturday 7PM");
        System.out.println(screening);
//        screening.addAttendee(new Customer(301, "Daniel", 34));
//        System.out.println(screening);
//        screening.addAttendee(new Customer(302, "Sophia", 29));
//        System.out.println(screening);
//        MovieScreening anotherScreening = new MovieScreening("Interstellar", "Sunday 5PM");
//        anotherScreening.addAttendee(new Customer(303, "Lucas", 42));
//        System.out.println(anotherScreening);

    }

}