/**
 *	@author Nic Mays
 *	@version problem 10.9
 */

import java.util.ArrayList;
class Course 
{
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;

	Course(String courseName) 
	{
		this.courseName = courseName;
	}
	
	//adds a student to student list
	public void addStudent(String student) 
	{
		this.students.add(student);
		this.numberOfStudents++;
	}
	
	//returns student list
	public ArrayList<String> getStudents() 
	{
		return students;
	}

	//returns number of students
	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}  
	
	//returns course name of the course object
	public String getCourseName() 
	{
		return courseName;
	}  
	
	//does an iterative search for the student and then removes their name;
	public void dropStudent(String student) 
	{
		for(int i=0; i<this.students.size(); i++)
		{
			if(this.students.get(i).equals(student))
			{
				this.students.remove(i);
				this.numberOfStudents--;
			}
		}
		
	}
	
	//Drops all students and resets the array to default value
	public void clear()
	{
		this.students.clear();
		this.numberOfStudents--;
	}
}

public class prob11_5 
{
	public static void main(String[] args) 
	{
		Course cs = new Course("Software Dev 1");
		
		cs.addStudent("Nic");
		cs.addStudent("Ronald");
		cs.addStudent("Andrew");
		cs.dropStudent("Nic");
		
		System.out.println("Current # of students: "+cs.getNumberOfStudents());
	}
}
