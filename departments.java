import java.util.Scanner;

class Employe {
    private int id;
    private String name;
    private double salary;

    Employe() {
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

    void display(Employe emp) {
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println("\n");

    }

}

public class departments {

    public static void main(String[] args) {
        Employe[] emp = new Employe[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            emp[i] = new Employe();
            System.out.println("Enter name=");
            String name = sc.next();
            System.out.println("Enter id=");
            int id = sc.nextInt();
            System.out.println("Enter Salary=");
            double salary = sc.nextDouble();
            emp[i].setId(id);
            emp[i].setSalary(salary);
            emp[i].setName(name);

        }
        for (int i = 0; i < 3; i++) {
            emp[i].display(emp[i]);
        }

    }

}
