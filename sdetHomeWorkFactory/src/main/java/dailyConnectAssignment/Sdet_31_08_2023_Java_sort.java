package dailyConnectAssignment;

import java.util.*;
class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
public class Sdet_31_08_2023_Java_sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		/*
		 * studentList.add(new Student(33, "Rumpa", 3.68)); studentList.add(new
		 * Student(85, "Ashis", 3.85)); studentList.add(new Student(56, "Samiha",
		 * 3.75)); studentList.add(new Student(19, "Samara", 3.75)); studentList.add(new
		 * Student(22, "Fahim", 3.76));
		 */
		
       
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
            
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
         Collections.sort(studentList, new Comparator<Student>() 
         {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // Descending order of CGPA
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname()); // Ascending order of name
                } else {
                    return Integer.compare(s1.getId(), s2.getId()); // Ascending order of ID
                }
            }
        });
         
         for(Student st: studentList)
         {
            System.out.println(st.getFname()); 
        }
	}
}



