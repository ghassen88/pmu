package controllers;


import dto.CourseDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.Course;
import model.Partant;
import service.CourseService;

import java.time.LocalDate;
import java.util.List;

@Path("/courses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseController {
    @Inject
    CourseService courseService;

    @POST
    public void createCourse(CourseDTO courseDTO) {
        List<Partant> partants = courseDTO.getPartants().stream()
                .map(p -> new Partant(p.getName(), p.getNumber()))
                .toList();
        Course course = new Course(courseDTO.getDate(), LocalDate.parse(courseDTO.getName()), courseDTO.getNumber(), partants);
        courseService.createCourse(course);
    }
}