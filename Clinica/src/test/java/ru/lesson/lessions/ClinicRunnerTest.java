package ru.lesson.lessions;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Den on 13.08.2015.
 */
public class ClinicRunnerTest {

    @Test
    public void testOtherOperation() throws Exception {
        ClinicRunner clinicRunner = new ClinicRunner();
        clinicRunner.OtherOperation();
        assertEquals(ClinicRunner.in, clinicRunner.OtherOperation());


    }
}