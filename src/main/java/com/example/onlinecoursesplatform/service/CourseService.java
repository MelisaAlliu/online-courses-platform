package com.example.onlinecoursesplatform.service;


import com.example.onlinecoursesplatform.dataTrasferObject.AppMapper;
import com.example.onlinecoursesplatform.dataTrasferObject.CourseDTO;
import com.example.onlinecoursesplatform.model.Course;
import com.example.onlinecoursesplatform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private AppMapper appMapper;

    public List<CourseDTO> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return appMapper.courseListToCourseDTOList(courses);
    }

    public CourseDTO addCourse(CourseDTO courseDTO) {
        Course course = appMapper.courseDTOToCourse(courseDTO);
        Course savedCourse = courseRepository.save(course);
        return appMapper.courseToCourseDTO(savedCourse);
    }
}
