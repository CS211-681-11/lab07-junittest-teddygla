package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testStudentAmount() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        StudentList ls = ds.readData();
        assertEquals(4, ls.getStudents().size());
    }

    @Test
    void testStudentName() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        StudentList ls = ds.readData();
        Student s = ls.getStudents().get(0);
        assertEquals("First", s.getName());

        s = ls.getStudents().get(3);
        assertEquals("Fourth", s.getName());
    }

    @Test
    void testStudentId() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        StudentList ls = ds.readData();
        Student s = ls.getStudents().get(1);
        assertEquals("6710400002", s.getId());

        s = ls.getStudents().get(2);
        assertEquals("6710400003", s.getId());
    }

}