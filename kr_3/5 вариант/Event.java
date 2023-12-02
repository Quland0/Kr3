class Event extends ShoppingMall{
    private String Eventname;
    private String Descriptionn;
    private String dateAndTime;

    public Event(String title, String address, int floors, boolean isCinema, String eventname, String descriptionn, String dateAndTime) {
        super(title, address, floors, isCinema);
        Eventname = eventname;
        Descriptionn = descriptionn;
        this.dateAndTime = dateAndTime;
    }

    public String getEventname() {
        return Eventname;
    }

    public void setEventname(String eventname) {
        Eventname = eventname;
    }

    public String getDescriptionn() {
        return Descriptionn;
    }

    public void setDescription(String descriptionn) {
        Descriptionn = descriptionn;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public void display() {

    }
    public String toString(){
        return super.toString() + "\nСобытие: " + Eventname + "\nОписание: "
                + Descriptionn + "\nВремя проведения: " + dateAndTime;
    }
}