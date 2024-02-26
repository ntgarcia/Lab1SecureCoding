**Lab 1: Secure Coding**

**Requirements**

- [x] **Input:**

  - [x] Prompt the user to enter their student name, GPA, and course code.
  - [X] Validate user input format and ranges.

- [x] **GPA Verification:**

  - [X] Check if the student's GPA meets the minimum requirement for course registration:
    - [X] GPA > 2.0: Allow registration.
    - [X] GPA ≤ 2.0: Inform user of ineligibility.

- [X] **Factory Pattern:**

  - [X] Implement Factory design pattern:
    - [X] Define abstract class/interface for students and courses.
    - [X] Implement concrete classes for specific student and course types.
    - [X] Create Student Factory class:
      - [X] Validate data.
      - [X] Create Student instances.
    - [X] Create Course Factory class:
      - [X] Validate data.
      - [X] Create RequiredCourse instances for for-credit courses.
      - [X] Create OptionalCourse instances for zero-credit courses.

- [] **Proxy Pattern:**

  - [] Implement Proxy design pattern to control access to registration:
    - [] Create proxy class as wrapper around registration process.
    - [] Verify student's GPA eligibility before allowing registration.
    - [] Prevent registration if GPA requirement is not met.

- [X] **Immutability:**

  - [X] Ensure objects are immutable once created:
    - [X] Declare all fields as private and final.
    - [X] Provide only getters, no setters.

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
