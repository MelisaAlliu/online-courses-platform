package com.example.onlinecoursesplatform.repository;

import com.example.onlinecoursesplatform.dataTrasferObject.AppMapper;
import com.example.onlinecoursesplatform.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
