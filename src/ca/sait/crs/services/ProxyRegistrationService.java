package ca.sait.crs.services;

import java.util.ArrayList;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Registration;
import ca.sait.crs.contracts.RegistrationService;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;

public class ProxyRegistrationService implements RegistrationService {

	private final RealRegistrationService realRegistrationService;

	public ProxyRegistrationService() {
		this.realRegistrationService = new RealRegistrationService();
	}

	@Override
	public Registration register(Student student, Course course) throws CannotCreateRegistrationException {
		// Check student's GPA eligibility before allowing registration
		if (isEligible(student)) {
			// Proceed with registration
			return realRegistrationService.register(student, course);
		} else {
			// Inform user of ineligibility
			throw new CannotCreateRegistrationException(
					"Student is not eligible for registration due to GPA requirement not met (GPA <= 2.0)");
		}
	}

	@Override
	public ArrayList<Registration> getRegistrations() {
		// Delegate the call to the corresponding method in the RealRegistrationService
		return realRegistrationService.getRegistrations();
	}

	// Helper method to check student's GPA eligibility
	private boolean isEligible(Student student) {
		// Assuming student object has a method to retrieve GPA
		double gpa = student.getGpa();
		return gpa > 2.0;
	}
}
