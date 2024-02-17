package ca.sait.crs.services;

import java.util.ArrayList;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Registration;
import ca.sait.crs.contracts.RegistrationService;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;

// TODO: Check student can be registered before passing to RealRegistrationService
// TODO: Make this class immutable.

public class ProxyRegistrationService implements RegistrationService {

    private final RealRegistrationService realRegistrationService;

    public ProxyRegistrationService() {
        this.realRegistrationService = new RealRegistrationService();
    }

    @Override
    public Registration register(Student student, Course course) throws CannotCreateRegistrationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public ArrayList<Registration> getRegistrations() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRegistrations'");
    }
    
}


