package Main;
import Main.AdminDepartment;
import Main.HrDepartment;
import Main.TechDepartment;
public class DriverMain {


public static void main(String[] args) {
		
AdminDepartment a1 = new AdminDepartment();

System.out.println("Welcome to " + a1.departmentName());
System.out.println(a1.getTodaysWork());
System.out.println(a1.getWorkDeadine());
System.out.println(a1.isTodayAHoliday());

HrDepartment h1 = new HrDepartment();
System.out.println("Welcome to " + h1.departmentName());
System.out.println(h1.getTodaysWork());
System.out.println(h1.getWorkDeadine());
System.out.println(h1.doActivity());
System.out.println(h1.isTodayAHoliday());

TechDepartment t1 = new TechDepartment();
System.out.println("Welcome to " + t1.departmentName());
System.out.println(t1.getTodaysWork());
System.out.println(t1.getWorkDeadine());
System.out.println(t1.getTechStackInformation());
System.out.println(t1.isTodayAHoliday());

}

}
