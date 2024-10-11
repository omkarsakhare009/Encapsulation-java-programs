import java.util.Scanner;

public class Employesalary {
    private int id;
    private String name;
    private double salary;

    Employesalary() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

    void updatesalary(Employesalary e, double salary) {
        e.setSalary(e.getSalary() + salary);

    }

    void display(Employesalary e) {
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println("\n");

    }

}

class office {
    public static void main(String[] args) {

        Employesalary[] e = new Employesalary[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            e[i] = new Employesalary();
            System.out.println("Enter name=");
            String name = sc.next();
            System.out.println("Enter id=");
            int id = sc.nextInt();
            System.out.println("Enter salary=");
            double salary = sc.nextDouble();

            e[i].setId(id);
            e[i].setName(name);
            e[i].setSalary(salary);
        }

        for (int i = 0; i < 3; i++) {
            e[i].updatesalary(e[i], 5000);
        }

        for (int i = 0; i < 3; i++) {
            e[i].display(e[i]);
        }

    }
}
