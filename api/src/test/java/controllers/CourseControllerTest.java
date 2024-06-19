package controllers;

import dto.CourseDTO;
import dto.PartantDto;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CourseService;

import javax.inject.Inject;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.mockito.Mockito.*;

    @QuarkusTest
    public class CourseControllerTest {

        @Inject
        CourseService courseService;

        @BeforeEach
        public void setUp() {
            RestAssured.basePath = "/courses";
        }

        @Test
        public void testCreateCourse() {



            PartantDto partant1 = new PartantDto();
            partant1.setName("Horse 1");
            partant1.setNumber(1);
            PartantDto partant2 = new PartantDto();
            partant2.setName("Horse 2");
            partant2.setNumber(2);
            PartantDto partant3 = new PartantDto();
            partant3.setName("Horse 3");
            partant3.setNumber(3);

            CourseDTO courseDTO = new CourseDTO();
            courseDTO.setDate("2024-06-14");
            courseDTO.setName("Race 1");
            courseDTO.setNumber(1);
            courseDTO.setPartants(List.of(partant1, partant2, partant3));

            given()
                    .contentType("application/json")
                    .body(courseDTO)
                    .when()
                    .post()
                    .then()
                    .statusCode(200);

            verify(courseService, times(1)).createCourse(any(Course.class));
        }
    }