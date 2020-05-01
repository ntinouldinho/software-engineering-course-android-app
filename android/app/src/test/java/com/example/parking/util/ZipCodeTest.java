package com.example.parking.util;

import com.example.parking.util.ZipCode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeTest {
    private ZipCode zipCode;
    private int zip;
    @Before
    public void setup(){
        zipCode = new ZipCode();
        zip=12345;
        zipCode.setZip(zip);
    }

    @Test
    public void FullConTest() {
        ZipCode zed = new ZipCode(5015);
        assertNotNull(zed);
    }
    @Test
    public void setCorrectZipTest() {
        zipCode.setZip(15122);
        assertEquals(15122,zipCode.getZip());
    }

    @Test
    public void setIncorrectZipTest() {
        zipCode.setZip(1512);
        assertEquals(12345,zipCode.getZip());
    }

    @Test
    public void toStringTest() {
        String str="ZipCode{" +
                "zip=" + zip +
                '}';
        assertEquals(str,zipCode.toString());
    }

    @Test
    public void equalsTest() {
        ZipCode z1 = new ZipCode(15235);
        ZipCode z2 = new ZipCode(15235);
        assertTrue(z1.equals(z2));
    }

}
