package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentListHardCodeDatasourceTest {
    @Test
    void testIsDataExisted() {
        StudentListHardCodeDatasource ds = new StudentListHardCodeDatasource();
        StudentList ls = ds.readData();

        assertEquals(10, ls.getStudents().size());

        Student s1 = ls.getStudents().get(0);
        assertEquals("First",s1.getName());

        Student s2 = ls.getStudents().get(1);
        assertEquals("Second",s2.getName());

        Student s3 = ls.getStudents().get(2);
        assertEquals("6710400003",s3.getId());

    }

    @Test
    void testWriteData() {
        StudentListHardCodeDatasource ds = new StudentListHardCodeDatasource();
        StudentList ls = ds.readData();

    }

}