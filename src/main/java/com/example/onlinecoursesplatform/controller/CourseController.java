package com.example.onlinecoursesplatform.controller;

import com.example.onlinecoursesplatform.dataTrasferObject.CourseDTO;
import com.example.onlinecoursesplatform.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<CourseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public CourseDTO addCourse(@RequestBody CourseDTO courseDTO) {
        return courseService.addCourse(courseDTO);
    }
}
