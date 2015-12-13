package com.epam.javatraining.lastperson;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindingLastPersonTest {

    public FindingLastPersonTest() {
    }

    @Test
    public void testFindLastPersonNull() {
        System.out.println("FindLastPerson check for NULL");
        FindingLastPerson finding = new FindingLastPerson();
        Object result = finding.FindLastPerson(null);
        assertEquals(null, result);
    }

    @Test
    public void testFindLastPersonEmptyList() {
        System.out.println("FindLastPerson check for empty list");
        FindingLastPerson finding = new FindingLastPerson();
        List persons = new LinkedList<>();
        try {
            Object result = finding.FindLastPerson(persons);
            fail("List of person is empty!!");
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testFindLastPersonString() {
        System.out.println("FindLastPerson with String list");
        List persons = new LinkedList<>();
        persons.add("1");
        persons.add("2");
        persons.add("3");
        persons.add("4");
        persons.add("5");
        persons.add("6");
        FindingLastPerson<String> finding = new FindingLastPerson<>();
        String result = finding.FindLastPerson(persons);
        assertEquals("5", result);
    }

    @Test
    public void testFindLastPersonInt() {
        System.out.println("FindLastPerson with Integer list");
        List persons = new LinkedList<>();
        persons.add(1);
        persons.add(2);
        persons.add(3);
        persons.add(4);
        persons.add(5);
        persons.add(6);
        persons.add(7);
        persons.add(8);
        persons.add(9);
        FindingLastPerson<Integer> finding = new FindingLastPerson<>();
        int result = finding.FindLastPerson(persons);
        assertEquals(3, result);
    }

}
