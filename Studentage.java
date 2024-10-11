import java.util.Scanner;

public class Studentage {
    private int age;
    private String name;
    private int id;

    Studentage() {
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public boolean Eligibleforvote(Studentage S) {
        if (S.getAge() >= 18) {
            return true;

        } else {

            return false;

        }

    }

    void display(Studentage S) {
        System.out.println("Id is=" + S.getId());
        System.out.println("Age is=" + S.getAge());
        System.out.println("Name=" + S.getName());
        if (Eligibleforvote(S)) {
            System.out.println("Eligible for vote");

        } else {
            System.out.println("Not eligible");
        }

        System.out.println("\n");

    }

}

class department {
    public static void main(String[] args) {

        Studentage[] S = new Studentage[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            S[i] = new Studentage();
            System.out.println("Enter name=");
            String name = sc.next();
            System.out.println("Enter age=");
            int age = sc.nextInt();
            System.out.println("Enter id=");
            int id = sc.nextInt();
            S[i].setId(id);
            S[i].setAge(age);
            S[i].setName(name);

        }
        for (int i = 0; i < 3; i++) {
            S[i].display(S[i]);
        }
    }

}
