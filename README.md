# Hospital-Management-System
This is a simple hospital management system built in Java that allows doctors and patients to interact in a digital environment. The project includes functionalities like doctor-patient registration, patient appointment scheduling, and doctor-patient assignments.

### Features

- **Doctor Registration and Authentication**
  - Doctors can log in using a unique ID and password.
  - Doctors can view their patient list and scheduled appointments.
  
- **Patient Registration and Authentication**
  - Patients can register with their ID, password, name, and gender.
  - Existing patients can log in and schedule appointments with a doctor of their choice.
  - Patients can choose the doctor, appointment times, and view their scheduled time slot.

- **Appointment Scheduling**
  - Patients can book appointments with doctors based on available time slots.
  - Doctors have access to their patient list and scheduled times.

## Project Setup

To run this project locally, follow the steps below:

## Prerequisites
- Java 8 or higher installed
- A text editor like IntelliJ IDEA or VSCode (optional)
  
## Steps to Run

1. Clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/HospitalManagementSystem.git
```
2. Navigate to the project folder and compile the Java code:
```bash
javac MedicalProject.java
```
3. Run the project:
```bash
java MedicalProject
```
## How It Works
1. Doctor and Patient Registration:
  - On first-time use, both doctors and patients need to register by entering their details.
  - Doctors have unique IDs and passwords, while patients can sign up with their name and gender.
    
2. Scheduling Appointments:
  - Patients can choose a doctor and schedule appointments by selecting an available time slot.

3. Doctor's Patient List:
  - Doctors can log in to see their daily appointments and patient details.

##Possible Future Enhancements
  - Add a database for data persistence (e.g., SQLite or MySQL).
  - Introduce more advanced features like managing patient history or doctor shifts.
  - Improve user interaction with a graphical interface (GUI) using JavaFX or Swing.
    
##Technologies Used
  - Java
  - Arrays and Lists for Data Management
  - Console-based UI

