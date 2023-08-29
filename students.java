class Student {
    private String ID;
    private String name;
    private String branch;
    private String university;

    public void setDetails(String ID, String name, String branch, String university) {
        this.ID = ID;
        this.name = name;
        this.branch = branch;
        this.university = university;
    }

    public void showDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("University: " + university);
    }
}

public class students {
    public static void main(String[] args) {
        Student[] students = new Student[3];

            students[0] = new Student();
            students[0].setDetails("21011503"  , "aashish", "Cse", "graphic era");
            students[1]=new Student();
            students[1].setDetails("221021452"  ,"james", "mechanical", "graphic era");
            students[2]=new Student();
            students[2].setDetails("21021333" ,"bond", "civil", "graphic era");

    
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            students[i].showDetails();
            System.out.println();
        }
    }
}

