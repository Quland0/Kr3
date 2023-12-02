public class Shop{
    private int Sid;
    private String stitle;
    private String description;
    private int NumOfEmployees;
    public Shop(int Sid, String stitle, String description, int NumOfEmployees){
        this.Sid = Sid;
        this.stitle = stitle;
        this.description = description;
        this.NumOfEmployees = NumOfEmployees;
    }
    public int getSid() {
        return Sid;
    }
    public void setSid(int sid) {
        Sid = sid;
    }
    public String getStitle() {
        return stitle;
    }
    public void setStitle(String stitle) {
        this.stitle = stitle;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getNumOfEmployees() {
        return NumOfEmployees;
    }
    public void setNumOfEmployees(int numOfEmployees) {
        NumOfEmployees = numOfEmployees;
    }
    public void print() {
        System.out.println("Shop id: " + this.Sid);
        System.out.println("Shop title: " + this.stitle);
        System.out.println("description: " + this.description);
        System.out.println("Number of Employess: " + this.NumOfEmployees);
    }
    @Override
    public String toString() {
        return "ID: " + getSid() +
                "\nНазвание: " + getStitle() +
                "\nОписание: " + getDescription() +
                "\nКол-во сотрудников: " + getNumOfEmployees();
    }
}
