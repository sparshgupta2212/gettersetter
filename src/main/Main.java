package main;

class Main {
    private String name;
    private int id;
    private String nCollege;

    Main(String name, int id, String nCollege) {
        this.id = id;
        this.name = name;
        this.nCollege =nCollege ;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    String getnCollege() {
        return nCollege;
    }
}
class ReadOnlyTest {

    public static void main(String[] args) {
        String nCollege = "Null";
        Main em=new Main("Sparsh gupta", 181500723, "Null");

        String name=em.getName();
        int id=em.getId();
        String nCompany=em.getnCollege();

        System.out.println("Student's name: " +name);
        System.out.println("Student's id: " +id);
        nCollege = "GLA university";
        System.out.println("College's name: " +nCollege);
    }
}

