
public class Main {
    public static void main(String[] args) {
            Employee e1 = new Employee("Bharat", 1);
        int check = (int) ((Math.random() * 10)) % 2;

        if (check == 0) {
            e1.attendence = 0;
        } else {
            e1.attendence = 1;
        }

        if (e1.attendence == 0) {
            e1.attendence = 0;
        }else {
            e1.attendence = 1;
            System.out.println("Employee is present");
            e1.workHour = 8;
        }
    }
}