package com.niit.ibm;

import com.niit.Problem1.ValidationBO;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import static org.junit.Assert.assertEquals;

public class ValidationJUnit {

    private ValidationBO validationBO;
    @Before
    public void init(){
        validationBO = new ValidationBO();
    }

    @Test
    public void testValidBookingId()
    {
        String result = validationBO.ValidateBookingId("1234");

        assertThat("Proper id", validationBO.ValidateBookingId("123"), is("Valid Booking Id"));
    }

    @Test
    public void testInvalidBookingId()
    {
        String result = validationBO.ValidateBookingId("sdhf34");
        assertThat("Improper Id set as proper", result, is("Invalid Booking Id"));
        assertThat("Null Id set as proper", validationBO.ValidateBookingId(null), is("Id is null"));
    }
}
