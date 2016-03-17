package com.cms.validator;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InputDateValidator implements ConstraintValidator<InputDate, Date> {

	@Override
	public void initialize(InputDate arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext arg1) {
		String value = date.toString();
		String reqValue = "(\\d{4})/(\\d\\d?)/(\\d\\d?)";
		
		if (value.matches(reqValue)) {

			int index = value.indexOf("/");
			int lastindex = value.lastIndexOf("/");
			
			//System.out.println("index = " + index + " " + lastindex);
			
			int month = Integer.parseInt(value.substring(index + 1, lastindex));
			int day = Integer.parseInt(value.substring(lastindex + 1, value.length()));
			
			if (month < 0 || month > 12) {
				System.out.println("Invalid month");
			}
			System.out.println("Valid month");
			
			return true;
		}
		
		//System.out.println("month =" + month);
		//System.out.println("year =" + year);		
		
		return false;
	}

}
