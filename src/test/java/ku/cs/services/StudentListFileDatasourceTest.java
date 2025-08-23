package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentListFileDatasourceTest {

    @Test
    void testIsFileExisted() {
        StudentListFileDatasource ds = new StudentListFileDatasource("data", "student-list.csv");
        StudentList ls = ds.readData();
        Student s = ls.getStudents().get(0);

        assertEquals(6, ls.getStudents().size());
        assertEquals("Tim Berners-Lee",s.getName());
        assertEquals(145.5,s.getScore());
        assertEquals("6410450001",s.getId());
    }

    @Test
    void testWriteData() {

        StudentListFileDatasource ds = new StudentListFileDatasource("data", "student-list.csv");

        StudentList ls = ds.readData();
        ls.addNewStudent("6710405435","Tongla",55);

        ds.writeData(ls);

        assertEquals(6, ls.getStudents().size());
        Student s =  ls.getStudents().get(5);
        assertEquals("Tongla",s.getName());


    }



}