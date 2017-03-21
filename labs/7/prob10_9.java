/**
 *	@author Nic Mays
 *	@aersion problem 10.9
 */

import java.util.Arrays;
class Course 
{
	private String courseName;
	private String[] students = new String[4];
	private int numberOfStudents;

	public Course(String courseName) 
	{
		this.courseName = courseName;
	}

	public void addStudent(String student) 
	{
		//Resizes array if number of students exceeds the size
		if(numberOfStudents>=students.length)
		{
			System.out.println(students.length);
			String copy[] = Arrays.copyOf(students, students.length+4);
			students = Arrays.copyOf(copy, copy.length);
			System.out.println(students.length);
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() 
	{
		return students;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}  

	public String getCourseName() 
	{
		return courseName;
	}  
	
	//does an iterative search for the student and then zeroes their name out
	public void dropStudent(String student) 
	{
		for(int i=0; i<this.students.length; i++)
			if(this.students.equals(student))
			{
				this.students[i]="";
				this.numberOfStudents--;
			}
		
	}
	
	//Drops all students and resets the array to default value
	public void clear()
	{
		this.students = new String[4];
		this.numberOfStudents=0;
	}
}

public class prob10_9 
{
	public static void main(String[] args) 
	{
		Course cs = new Course("Software Development 1");
		
		//adds 3 students then drops the first
		cs.addStudent("Nic");
		cs.addStudent("Andrew");
		cs.addStudent("Ronald");
		cs.dropStudent("Nic");
		
		//displays number of students
		System.out.println(cs.getNumberOfStudents());		
	}
}
