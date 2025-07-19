package com.masaischool.B28_SB201_Ex_24.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masaischool.B28_SB201_Ex_24.dto.StudentDTO;
import com.masaischool.B28_SB201_Ex_24.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	Optional<Student> findByName(String name);
//	select s from student s where s.name = :name
	
	List<Student> findByRollGreaterThanOrMarkLessThanEqual(Integer roll, Integer marks);
//	where s  from student s where s.roll > :roll or s.marks <= :marks
	
//	the above 
//	
//	@Query("SELECT S FROM STUDENT S WHERE S.marks BETWEEN :begin AND :end") // named parameter
//	List<Student> abc(@Param("begin") Integer begin, @Param("end") Integer end); 
	
	
	@Query("Select S from student s where s.marks between :begin and :end")
	List<Student> abc(@Param("begin") Integer begin, @Param("end") Integer end);
	
	
	@Query("select s.name from student s where s.marks>?1 marks")
	List<String> getNameByMarks(Integer marks);
	
	@Query(value = "SELECT * FROM ST",nativeQuery= true)
	List<String> getAllStudentByNativeQuery();
	
	
	@Query("Select new com.masaischool.B28_SB201_Ex_24.dto.StudentDTO(s.name, s.marks) from student s where s.roll> ?1 roll")
	List<StudentDTO> getDetailsByROllNumberMore(Integer roll);
	
	
	public List<Student> findTop5ByOrderByNameDes();
	
	public List<Student> findTop3ByMarksGreaterThan(Integer marks);
	
}
