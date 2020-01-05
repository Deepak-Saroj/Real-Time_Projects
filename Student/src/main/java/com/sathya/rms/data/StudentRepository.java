package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
