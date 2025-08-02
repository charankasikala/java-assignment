import java.util.Scanner;

class MedicalRecord {
    protected String recordId;
    protected String patientName;
    protected String dateOfVisit;
    protected String diagnosis;

    public void inputRecordDetails(Scanner scanner) {
        System.out.print("Enter Record ID: ");
        recordId = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        patientName = scanner.nextLine();
        System.out.print("Enter Date of Visit (dd-mm-yyyy): ");
        dateOfVisit = scanner.nextLine();
        System.out.print("Enter Diagnosis: ");
        diagnosis = scanner.nextLine();
    }

    public void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatientRecord extends MedicalRecord {
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails(Scanner scanner) {
        inputRecordDetails(scanner);
        System.out.print("Enter Room Number: ");
        roomNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Room Charges per Day: ");
        roomCharges = Double.parseDouble(scanner.nextLine());
    }

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: RS." + roomCharges);
        System.out.println("Total Charges: Rs." + calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails(Scanner scanner) {
        inputRecordDetails(scanner);
        System.out.print("Enter Doctor Name: ");
        doctorName = scanner.nextLine();
        System.out.print("Enter Consultation Fee: ");
        consultationFee = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: Rs." + consultationFee);
    }
}


public class HospitalRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== In-Patient Record ===");
        InPatientRecord inPatient = new InPatientRecord();
        inPatient.inputInPatientDetails(scanner);
        System.out.println("\nIn-Patient Details:");
        inPatient.displayRecord();

        System.out.println("\n=== Out-Patient Record ===");
        OutPatientRecord outPatient = new OutPatientRecord();
        outPatient.inputOutPatientDetails(scanner);
        System.out.println("\nOut-Patient Details:");
        outPatient.displayRecord();

        scanner.close();
    }
}





/*
 * 
 * Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
 */