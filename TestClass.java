//Coded By Rodrigo Peixoto
//Coded on 04/16/2023
// I understand this isnt fully complete.
/*
	In the code provided, there are several areas that utilize the concept of polymorphism. 
	The classes 'Person', 'Soldier', 'Student', 'Candidate', and 'TestClass' all have different properties and behaviors, but they are related through inheritance. 
	This means that they share common attributes and methods. For example, the 'Person' class serves as a base class for the other classes, 
	and it has properties such as 'name' and 'date of birth' that are common to all subclasses. 
	The 'Soldier' class extends the 'Person' class and adds properties specific to soldiers, such as 'rank' and 'branch'. Similarly, the '
	Student' and 'Candidate' classes extend the 'Person' class and add properties related to their respective roles. The 'TestClass' is an abstract 
	class that defines a method that all subclasses must implement. This allows for different implementations of the method depending on the specific class. 
	Overall, the use of polymorphism in the code helps to make it more modular and easier to extend in the future.
*/

import java.util.ArrayList;
import java.util.Scanner;

import candidate.Candidate;
import candidate.Cheatable;
import candidate.Student;
import military.Military;
import person.Name;
import person.Person;
import person.Date;
import candidate.PoliticalCandidate;



public class TestClass {
    public static void main(String[] args) {
    	ArrayList<Student> students = new ArrayList<>();
    	ArrayList<Candidate> candidates = new ArrayList<>();
    	ArrayList<Soldier> soldiers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        
        
        while(!done) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add a Candidate");
            System.out.println("3. Add a Soldier");
            System.out.println("4. Display output");
            System.out.println("5. Quit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter first name:");
                    String firstName = scanner.next();
                    System.out.println("Enter last name:");
                    String lastName = scanner.next();
                    System.out.println("Enter middle initial:");
                    char middleInitial = scanner.next().charAt(0);
                    Name name = new Name(firstName, lastName, middleInitial);
                    System.out.println("Enter date of birth (month day year):");
                    int month = scanner.nextInt();
                    int day = scanner.nextInt();
                    int year = scanner.nextInt();
                    Date dob = new Date(month, day, year);
                    System.out.println("Enter major:");
                    String major = scanner.next();
                    System.out.println("Enter GPA:");
                    double gpa = scanner.nextDouble();
                    System.out.println("Is the student a cheater? (true/false):");
                    boolean cheater = scanner.nextBoolean();
                    Student student = new Student(name, dob, major, gpa, cheater);
                    students.add(student);
                    break;

                case 2:
                    System.out.println("Enter first name:");
                    String firstName2 = scanner.next();
                    System.out.println("Enter last name:");
                    String lastName2 = scanner.next();
                    System.out.println("Enter middle initial:");
                    char middleInitial2 = scanner.next().charAt(0);
                    Name name2 = new Name(firstName2, lastName2, middleInitial2);
                    System.out.println("Enter date of birth (month day year):");
                    int month2 = scanner.nextInt();
                    int day2 = scanner.nextInt();
                    int year2 = scanner.nextInt();
                    Date dob2 = new Date(month2, day2, year2);
                    System.out.println("Enter party:");
                    String party = scanner.next();
                    System.out.println("Enter position:");
                    String position = scanner.next();
                    Candidate candidate = new Candidate(name2, dob2, party, position);
                    candidates.add(candidate);
                    break;

                case 3:
                    System.out.println("Enter first name:");
                    String firstName3 = scanner.next();
                    System.out.println("Enter last name:");
                    String lastName3 = scanner.next();
                    System.out.println("Enter middle initial:");
                    char middleInitial3 = scanner.next().charAt(0);
                    Name name3 = new Name(firstName3, lastName3, middleInitial3);
                    System.out.println("Enter date of birth (month day year):");
                    int month3 = scanner.nextInt();
                    int day3 = scanner.nextInt();
                    int year3 = scanner.nextInt();
                    Date dob3 = new Date(month3, day3, year3);
                    System.out.println("Enter rank:");
                    String rank = scanner.next();
                    System.out.println("Enter branch:");
                    String branch = scanner.next();
                    System.out.println("Is the soldier an officer? (true/false):");
                    boolean officer = scanner.nextBoolean();
                    Soldier soldier = new Soldier(name3, dob3, rank, branch, officer);
                    soldiers.add(soldier);
                    break;

                case 4:
                    // Display output
                    System.out.println("Displaying output:\n");
                    for (Student s : students) {
                        System.out.println(s.toString());
                        s.thisIsWhatIDo();
                        System.out.println(); // Add a blank line for formatting
                    }
                    for (Candidate c : candidates) {
                        System.out.println(c.toString());
                        c.thisIsWhatIDo();
                        System.out.println(); // Add a blank line for formatting
                    }
                    for (Soldier sol : soldiers) {
                        System.out.println(sol.toString());
                        sol.thisIsWhatIDo();
                        System.out.println(); // Add a blank line for formatting
                    }
                    break;


                case 5:
                    done = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}