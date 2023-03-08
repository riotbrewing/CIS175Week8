package Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Student.beans.PersonalDetails;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 7, 2023
 */

@Repository
public interface StudentRepository extends JpaRepository<PersonalDetails, Long>{
	

}
