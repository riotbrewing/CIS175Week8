package Student.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */
@Entity
public class PersonalDetails {
	@Id
	@GeneratedValue
	private long id;
	private int student_id;
	private String student_name;
	private double student_gpa;
	
	public PersonalDetails() {
		super();
	}

	public PersonalDetails(int student_id) {
		super();
		this.student_id = student_id;
	}

	public PersonalDetails(int student_id, String student_name, double student_gpa) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_gpa = student_gpa;
	}

	public PersonalDetails(long id, int student_id, String student_name, double student_gpa) {
		super();
		this.id = id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_gpa = student_gpa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public double getStudent_gpa() {
		return student_gpa;
	}

	public void setStudent_gpa(double student_gpa) {
		this.student_gpa = student_gpa;
	}

	@Override
	public String toString() {
		return "beans [id=" + id + ", student_id=" + student_id + ", student_name=" + student_name + ", student_gpa="
				+ student_gpa + "]";
	}
}
