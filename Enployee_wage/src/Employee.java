public class Employee {
    String name;
    Integer id;
    Integer wagePerHour;
    Integer workHour = 0;
    Integer attendence;

    Employee(String n, Integer i,Integer w){
        this.name = n;
        this.id = i;
        this.wagePerHour = w;
    }
}