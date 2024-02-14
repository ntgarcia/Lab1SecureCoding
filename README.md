**Lab 1: Secure Coding**

**Overview**

This lab focuses on implementing secure coding practices using design patterns such as Factory and Proxy, and ensuring immutability of objects. The program prompts the user to enter their student name, GPA, and the course code of the course they want to register for. It validates user input, checks GPA eligibility for course registration, encapsulates object creation using the Factory pattern, controls access to registration using the Proxy pattern, and ensures immutability of objects.

**Requirements**

- [ ] **Input:**
  - [ ] Prompt the user to enter their student name, GPA, and course code.
  - [ ] Validate user input format and ranges.

- [ ] **GPA Verification:**
  - [ ] Check if the student's GPA meets the minimum requirement for course registration:
    - [ ] GPA > 2.0: Allow registration.
    - [ ] GPA ≤ 2.0: Inform user of ineligibility.

- [ ] **Factory Pattern:**
  - [ ] Implement Factory design pattern:
    - [ ] Define abstract class/interface for students and courses.
    - [ ] Implement concrete classes for specific student and course types.
    - [ ] Create Student Factory class:
      - [ ] Validate data.
      - [ ] Create Student instances.
    - [ ] Create Course Factory class:
      - [ ] Validate data.
      - [ ] Create RequiredCourse instances for for-credit courses.
      - [ ] Create OptionalCourse instances for zero-credit courses.

- [ ] **Proxy Pattern:**
  - [ ] Implement Proxy design pattern to control access to registration:
    - [ ] Create proxy class as wrapper around registration process.
    - [ ] Verify student's GPA eligibility before allowing registration.
    - [ ] Prevent registration if GPA requirement is not met.

- [ ] **Immutability:**
  - [ ] Ensure objects are immutable once created:
    - [ ] Declare all fields as private and final.
    - [ ] Provide only getters, no setters.

- [ ] **Output:**
  - [ ] Display appropriate messages regarding registration status:
    - [ ] Successful registration.
    - [ ] Notification of ineligibility due to GPA requirements not met.

**Implementation**

- [ ] **Input Validation:** Ensure user input is properly validated to prevent invalid data entry.

- [ ] **GPA Verification:** Check if student's GPA meets course registration requirements.

- [ ] **Factory Pattern:** Encapsulate creation of student and course objects using Factory pattern.

- [ ] **Proxy Pattern:** Control access to registration functionality using Proxy pattern, verifying GPA eligibility.

- [ ] **Immutability:** Ensure objects cannot be modified after creation, maintaining data integrity.

**Output**

- [ ] Display messages indicating registration status:
  - [ ] Successful registration.
  - [ ] Notification of ineligibility due to GPA requirements not met.
