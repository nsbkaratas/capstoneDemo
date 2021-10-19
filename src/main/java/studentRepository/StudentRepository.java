package studentRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import capstoneModel.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer>{
	
	List<StudentModel> findByName(String name);// this is going to have bunch of methods that we will import
}
