package ca.sait.crs.models;

import interfaces.Validator;

/**
 * Validates course code.
 */
public class CourseCodeValidator implements Validator {

    @Override
    public boolean validate(String courseCode) {
        if (courseCode == null || courseCode.isEmpty()) {
            return false;
        }

        
        
        
        return true;
    }
}
