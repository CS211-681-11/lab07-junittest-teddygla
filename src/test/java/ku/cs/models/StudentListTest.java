package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนใหม่")
    void testAddStudent() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6710405435","Test1");
        Student s = sl.findStudentById("6710405435");
        assertEquals("Test1",s.getName());
    }

    @Test
    @DisplayName("ทดสอบการหาชื่อนักเรียนด้วยรหัสนิสิต")
    void testFindStudentById() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6710405435","Test1");
        sl.addNewStudent("6710405434","Test2");
        sl.addNewStudent("6710405433","Test3");
        Student s = sl.findStudentById("6710405434");
        assertEquals("Test2",s.getName());
    }

    @Test
    @DisplayName("ทดสอบการหาจำนวนนักเรียนโดยชื่อ")
    void testFilterByName() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6710405435","Test1");
        sl.addNewStudent("6710405434","Test2");
        sl.addNewStudent("6710405433","Test3");

        StudentList filtered = sl.filterByName("Test3");
        assertEquals(1,filtered.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบการลงคะเเนนด้วยรหัสนิสิต")
    void testGiveScoreOfId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6710405435","Test1");
        sl.giveScoreToId("6710405435",90);
        Student s = sl.findStudentById("6710405435");
        assertEquals(90,s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดของนักเรียน")
    void testViewGradeOfId() {
        StudentList sl = new StudentList();
        sl.addNewStudent("6710405435","Test1");
        sl.giveScoreToId("6710405435",90);
        String s = sl.viewGradeOfId("6710405435");
        assertEquals("A",s);

    }





}