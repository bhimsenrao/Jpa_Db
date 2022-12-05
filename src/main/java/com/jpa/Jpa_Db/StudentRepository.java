package com.jpa.Jpa_Db;

import org.springframework.data.repository.CrudRepository;
import com.jpa.Jpa_Db.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
