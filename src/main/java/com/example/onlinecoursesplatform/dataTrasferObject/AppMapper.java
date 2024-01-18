package com.example.onlinecoursesplatform.dataTrasferObject;

import com.example.onlinecoursesplatform.model.Course;
import com.example.onlinecoursesplatform.model.CourseCategory;
import com.example.onlinecoursesplatform.model.Users;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AppMapper {

    CourseDTO courseToCourseDTO (Course course);
    Course courseDTOToCourse (CourseDTO courseDTO);

    CourseCategoryDTO courseCategoryToDTO (CourseCategory courseCategory);
    CourseCategory courseCategoryDTOToCourseCategory (CourseCategoryDTO courseCategoryDTO);

    UsersDTO usersToUsersDTO (Users users);
    Users usersDTOToUsers (UsersDTO usersDTO);

    List<CourseDTO> courseListToCourseDTOList(List<Course> courses);

}
