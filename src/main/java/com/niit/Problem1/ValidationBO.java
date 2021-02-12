package com.niit.Problem1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationBO {

    public String ValidateBookingId(String id)
    {
        if(id == null)
        {
            return "Id is null";
        }
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(id);
        if(matcher.matches())
            return "Valid Booking Id";
        else
            return "Invalid Booking Id";

    }
}
