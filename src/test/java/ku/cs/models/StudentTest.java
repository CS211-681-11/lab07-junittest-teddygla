package ku.cs.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;
    @BeforeEach
    void init() {
        s = new Student("6710405435","test",67.0);
    }


    @Test
    @DisplayName("ทดสอบการเพิ่มคะเเนน 40.1 คะเเนน")
    void testAddScore() {
        //Student s = new  Student("6710405435", "test");
        s.addScore(4);
        assertEquals(71.0, s.getScore());
    }

    @Test
    void testCalculateGrade() {
        //Student s = new  Student("6710405435", "test");
        s.addScore(4);
        assertEquals("B", s.grade());
    }

    @Test
    void testChangeName() {
        s.changeName("test");
        assertEquals("test", s.getName());
    }

    @Test
    void testIsid() {
        assertEquals(true, s.isId(s.getId()));
    }

    @Test
    void testIsNameContains() {
        assertEquals(true, s.isNameContains(s.getName()));
    }

    @Test
    void testGetName() {
        assertEquals("test", s.getName());
    }

    @Test
    void testGetId() {
        assertEquals("6710405435", s.getId());
    }

    @Test
    void testGetScore() {
        assertEquals(67, s.getScore());
    }

    @Test
    void testGetGrade() {
        assertEquals("C", s.getGrade());
    }

    @Test
    void testToString() {
        assertEquals("{id: '6710405435', name: 'test', score: 67.0}", s.toString());
    }


}