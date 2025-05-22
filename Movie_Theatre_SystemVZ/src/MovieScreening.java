public class MovieScreening {
    private String movieTitle;
    private String screeningTime;
    //private int attendees;

    public MovieScreening(String movieTitle, String screeningTime) {
        this.movieTitle = movieTitle;
        this.screeningTime = screeningTime;
        //this.attendees = attendees;
    }

    @Override
    public String toString() {
        return this.movieTitle + " (" + this.screeningTime + ") ";

    }

    //@Override
//    public String addAttendee(Customer) {
//        return this.movieTitle + " (" + this.screeningTime + ") :" + this.attendees;
//    }

}
