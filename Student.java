public class Student {
    private String ID;
    private String Name;
    private String Branch;
    private String city;
    private String university;

    public Student(String ID) {
        this(ID, null, null, null, null);
    }

    public Student(String ID, String Name) {
        this(ID, Name, null, null, null);
    }

    public Student(String ID, String Name, String Branch) {
        this(ID, Name, Branch, null, null);
    }

    public Student(String ID, String Name, String Branch, String city) {
        this(ID, Name, Branch, city, null);
    }

    public Student(String ID, String Name, String Branch, String city, String university) {
        this.ID = ID;
        this.Name = Name;
        this.Branch = Branch;
        this.city = city;
        this.university = university;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + Name + ", Branch: " + Branch + ", City: " + city + ", University: "
                + university;
    }

    public static void main(String[] args) {

        Student student1 = new Student("123");
        System.out.println(student1);
        Student student2 = new Student("234", "John cena");
        System.out.println(student2);

        Student student3 = new Student("345", "aashish", "Computer Science");
        System.out.println(student3);

        Student student4 = new Student("456", "james bond", "Mechanical", "New York");
        System.out.println(student4);

        Student student5 = new Student("567", "Roman Reign", "Electrical", "Dehradun", "Graphic University");
        System.out.println(student5);
    }
}
