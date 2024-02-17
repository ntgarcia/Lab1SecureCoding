package ca.sait.crs.models;

import interfaces.Validator;

/**
 * Validates course code.
 */
public class CourseCodeValidator implements Validator {

    @Override
    public boolean validate(String courseCode) {
        // TODO: Add logic to validate course code.
        // For example, check if the format is correct.
        return true;
    }
}
