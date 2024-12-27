package com.teachermanagement.util;
/**
 *
 * @author SuyogShrestha23048669
 */
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class ValidationUtil {

    // Validate Teacher ID
    public static boolean isValidTeacherId(String teacherId, JLabel lblError) {
        if (teacherId.isEmpty()) {
            lblError.setText("Teacher ID cannot be empty.");
            return false;
        }
        try {
            int id = Integer.parseInt(teacherId);
            if (id <= 0) {
                lblError.setText("Teacher ID must be a positive number.");
                return false;
            }
        } catch (NumberFormatException e) {
            lblError.setText("Teacher ID must be a valid integer.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Teacher Name
    public static boolean isValidTeacherName(String teacherName, JLabel lblError) {
        if (teacherName.isEmpty()) {
            lblError.setText("Teacher name cannot be empty.");
            return false;
        }
        if (!teacherName.matches("[a-zA-Z ]+")) {
            lblError.setText("Teacher name must only contain letters and spaces.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Salary
    public static boolean isValidSalary(String salary, JLabel lblError) {
        if (salary.isEmpty()) {
            lblError.setText("Salary cannot be empty.");
            return false;
        }
        try {
            double salaryValue = Double.parseDouble(salary);
            if (salaryValue <= 0) {
                lblError.setText("Salary must be a positive number.");
                return false;
            }
        } catch (NumberFormatException e) {
            lblError.setText("Salary must be a valid number.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Email
    public static boolean isValidEmail(String email, JLabel lblError) {
        if (email.isEmpty()) {
            lblError.setText("Email cannot be empty.");
            return false;
        }
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            lblError.setText("Invalid email format.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Phone Number
    public static boolean isValidPhoneNumber(String phoneNumber, JLabel lblError) {
        if (phoneNumber.isEmpty()) {
            lblError.setText("Phone number cannot be empty.");
            return false;
        }
        if (!phoneNumber.matches("\\d{10}")) {
            lblError.setText("Phone number must be 10 digits.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Address
    public static boolean isValidAddress(String address, JLabel lblError) {
        if (address.isEmpty()) {
            lblError.setText("Address cannot be empty.");
            return false;
        }
        if (address.length() < 5) {
            lblError.setText("Address must be at least 5 characters long.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Qualification
    public static boolean isValidQualification(String qualification, JLabel lblError) {
        if (qualification.isEmpty()) {
            lblError.setText("Qualification cannot be empty.");
            return false;
        }
        if (!qualification.matches("[a-zA-Z ]+")) {
            lblError.setText("Qualification must only contain letters and spaces.");
            return false;
        }
        lblError.setText("");
        return true;
    }

    // Validate Specialization
    public static boolean isValidSpecialization(String specialization, JLabel lblError) {
        if (specialization.isEmpty()) {
            lblError.setText("Specialization cannot be empty.");
            return false;
        }
        if (!specialization.matches("[a-zA-Z ]+")) {
            lblError.setText("Specialization must only contain letters and spaces.");
            return false;
        }
        lblError.setText("");
        return true;
    }
}
