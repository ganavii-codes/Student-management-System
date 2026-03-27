package student;
import java.util.*;
class Student {
//	instance variables
	int id;
	String name;
	double marks;
//	constructor
	Student(int id, String n, double m){
		this.id = id;
		this.name = n;
		this.marks = m;
	}
	void display() {
		System.out.println("ID: "+id+", Name: "+name+", Marks: "+marks);
	}
}
public class Management {
	public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
//        	menu
        	System.out.println("1. Add Student");
        	System.out.println("2. Display Students");
        	System.out.println("3. Search Student");
        	System.out.println("4. Delete Student");
        	System.out.println("5. Exit");
        	
        	System.out.println("ENTER CHOICE: ");
        	int choice = sc.nextInt();
        	switch (choice) {
        	case 1:
        		System.out.println("Enter ID: ");
        		int id = sc.nextInt();
        		sc.nextLine();
        		System.out.println("Enter Name: ");
        		String name = sc.nextLine();
        		System.out.println("Enter Marks: ");
        		double marks = sc.nextDouble();
        		students.add(new Student(id,name,marks));
        		System.out.println("Student added!!");
        		break;
        	case 2 :
        		for(Student s : students) {
        			s.display();
        		}
        		break;
        	case 3 :
        		System.out.println("Enter ID to search: ");
        		int searchId = sc.nextInt();
        		boolean found = false;
        		for(Student s : students) {
        			if(s.id == searchId) {
        				s.display();
        				found = true;
        			}
        		}
        		if(!found) {
        			System.out.println("Student not found");
        		}
        		break;
        	case 4 :
        		System.out.println("Enter ID to delete: ");
        		int deleted = sc.nextInt();
        		students.removeIf(s->s.id == deleted);
        		System.out.println("Student removed!");
        		break;
        	case 5 :
        		System.out.println("Program Ended!!");
        		return;
        		default :
        			System.out.println("Invalid choice");
        	}
        	
        }
	}

}
