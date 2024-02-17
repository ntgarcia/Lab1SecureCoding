package ca.sait.crs.models;

import interfaces.Validator;

/**
 * Validates student ID.
 */
public class StudentIDValidator implements Validator {

    @Override
    public boolean validate(String studentID) {
       
    	 if (studentID == null || studentID.isEmpty()) {
             return false;
         }
    	
        return true;
    }
}
