package org.launchcode.techjobs.oo;

import org.junit.Test;


import static org.junit.Assert.*;
//TASK 4
public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job(null, new Employer(null), new Location(null), new PositionType("Full-time"), new CoreCompetency("Data Engineer"));
        Job job2 = new Job("Software Engineer", new Employer("Apple"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
        assertNotEquals(job1, job2);


    }
    //TASK 5
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Software Engineer", new Employer("Apple"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Software Engineer" + System.lineSeparator() + "Employer: Apple" + System.lineSeparator() + "Location: California" + System.lineSeparator() + "Position Type: Full-time" + System.lineSeparator() + "Core Competency: Java" + System.lineSeparator();
        assertEquals(expected, job.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Software Engineer", new Employer("Apple"), new Location("California"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected= System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Software Engineer" + System.lineSeparator() +
                "Employer: Apple" + System.lineSeparator() +
                "Location: California" + System.lineSeparator() +
                "Position Type: Full-time" + System.lineSeparator() +
                "Core Competency: Java" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("ABI"), new Location("St Louis"), new PositionType(""), new CoreCompetency("SQL"));
        String expected = System.lineSeparator() +
                "ID: " + job.getId() +System.lineSeparator() +
                "Name: Data not available"+System.lineSeparator() +
                "Employer: ABI"+System.lineSeparator() +
                "Location: St Louis"+System.lineSeparator() +
                "Position Type: Data not available"+System.lineSeparator()
               + "Core Competency: SQL"+ System.lineSeparator()
                ;
        assertEquals(expected, job.toString());
    }
}


