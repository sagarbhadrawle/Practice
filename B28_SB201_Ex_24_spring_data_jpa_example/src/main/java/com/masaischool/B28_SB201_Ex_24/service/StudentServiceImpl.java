package com.masaischool.B28_SB201_Ex_24.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.masaischool.B28_SB201_Ex_24.dto.StudentDTO;
import com.masaischool.B28_SB201_Ex_24.entity.Student;
import com.masaischool.B28_SB201_Ex_24.exception.StudentNotFoundException;
import com.masaischool.B28_SB201_Ex_24.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		
		this.studentRepository = studentRepository;
		
		System.out.println("the name of implementing class is :" +this.studentRepository.getClass().getName());
	}
	

	@Override
	public Student addStudent(Student st) {
		
		
		return studentRepository.save(st);
	}	

	@Override
	public Student viewStudentByRoll(Integer roll) {
		// TODO Auto-generated method stub
		Optional<Student> optional = studentRepository.findById(roll);
		
		return optional.orElseThrow(() -> new StudentNotFoundException("No Student exist for given roll"));
		
		
	}

	@Override
	public List<Student> viewStudentByMarksRange(Integer start, Integer end) {
		// TODO Auto-generated method stub
		return studentRepository.abc(start, end);
	}

	@Override
	public List<String> viewStudetByMarks(Integer marks) {
		// TODO Auto-generated method stub
		return studentRepository.getNameByMarks(marks);
	}

	
	
	
	@Override
	public List<String> viewAllStudentByNQ() {
		// TODO Auto-generated method stub
		return studentRepository.getAllStudentByNativeQuery();
	}

	@Override
	public List<Student> viewStudentByRollGreaterThanOrMarks(Integer roll, Integer marks) {
		// TODO Auto-generated method stub
		return studentRepository.findByRollGreaterThanOrMarkLessThanEqual(roll, marks);
	}

	@Override
	public List<Student> viewAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getTop5ByOrderByNameDesc() {
		// TODO Auto-generated method stub
		return studentRepository.findTop5ByOrderByNameDes();
	}

	@Override
	public List<Student> getTop3ByMarksGreaterThan(Integer marks) {
		
		return studentRepository.findTop3ByMarksGreaterThan(marks);
	}

	@Override
	public List<Student> getByCustomerSortOrders(String fieldOne, String directionOne, String fieldTwo,
			String directionTwo) {
		// TODO Auto-generated method stub
		Sort sort = null;
		if(directionOne.equalsIgnoreCase("asc"))
			sort = Sort.by(fieldOne);
		else 
			sort  = Sort.by(Sort.Direction.DESC,fieldOne);
			
		if(directionTwo.equalsIgnoreCase("asc"))
			sort = sort.and(Sort.by(fieldTwo));
		else 
			sort = sort.and(Sort.by(Sort.Direction.DESC,fieldTwo));
			
		
		return studentRepository.findAll(sort);
	}

	@Override
	public List<Student> getStudentsPageWise(int page, int size) {
		
		Pageable pg = PageRequest.of(page,size);
		
		Page<Student> pageStudent = studentRepository.findAll(pg);
		
		if(!pageStudent.hasContent()) {
			throw new StudentNotFoundException("no Student records for page"+page);
		}
		
		return pageStudent.getContent();
	}

//	@Override
//	public Student updateStudent(Integer roll, Integer marks) {
//		
//		Student student = studentRepository.findById(marks).orElseThrow(()(
//			
//			()->new StudentNotFoundException("no student "+ roll)
//		);
//				
//		student.setMarks(marks);
//		return studentRepository.save(student);
//	}

//	@Override
//	public String deleteStudentByRoll(Integer roll) {
//		Student student = studentRepository.findById(roll).orElseThrow(
//				()-> new StudentNotFoundException("no student exists for given roll"+ roll)
//				)
//				
//			studentRepository.delete(student);
//		
//		return "Student deleted successfully;
//	}
//
//	@Override
//	public List<StudentDTO> getDetailsByRollNumberMore(Integer roll) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
