public class Parking extends ShoppingMall {
    private int NumoftotalSpaces;
    private boolean emptyspace;
    private int emptyspases;

    public Parking(String title, String address, int floors, boolean isCinema, int numoftotalSpaces, boolean emptyspace, int emptyspases) {
        super(title, address, floors, isCinema);
        this.NumoftotalSpaces = numoftotalSpaces;
        this.emptyspace = emptyspace;
        this.emptyspases = emptyspases;
    }

    public int getNumoftotalSpaces() {
        return NumoftotalSpaces;
    }
    public void setNumoftotalSpaces(int numoftotalSpaces) {
        NumoftotalSpaces = numoftotalSpaces;
    }
    public boolean isEmptyspace() {
        return emptyspace;
    }
    public void setEmptyspace(boolean emptyspace) {
        this.emptyspace = emptyspace;
    }
    public int getEmptyspases() {
        return emptyspases;
    }
    public void setEmptyspases(int emptyspases) {
        this.emptyspases = emptyspases;
    }
    @Override
    public void display() {

    }
    @Override
    public String toString() {
        return super.toString() +"\n\nПарковка" +
                "\nNum of totalSpaces: " + NumoftotalSpaces +
                "\nempty space: " + emptyspace +
                "\nempty spases: " + emptyspases
                ;
    }
}
