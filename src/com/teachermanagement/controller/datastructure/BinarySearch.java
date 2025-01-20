/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teachermanagement.controller.datastructure;
import com.teachermanagement.model.TeacherModel;
import java.util.List;
/**
 *
 * @author SuyogShrestha23048669
 */
public class BinarySearch {

    // Public method to initialize the binary search call
    public TeacherModel searchByName(String searchValue, List<TeacherModel> teacherList) {
        if (teacherList == null || teacherList.isEmpty()) {
            return null; // Return null if the list is empty
        }
        return searchByName(searchValue.toLowerCase(), teacherList, 0, teacherList.size() - 1);
    }

    // Recursive binary search by teacher name
    private TeacherModel searchByName(String searchValue, List<TeacherModel> teacherList, int left, int right) {
        if (right < left) {
            return null; // Return null if the element is not found
        }

        int mid = (left + right) / 2;

        String midName = teacherList.get(mid).getTeacherName().toLowerCase();

        // Compare and check if the middle element matches the search value
        if (searchValue.equals(midName)) {
            return teacherList.get(mid);
        } else if (searchValue.compareTo(midName) < 0) {
            return searchByName(searchValue, teacherList, left, mid - 1); // Search the left half
        } else {
            return searchByName(searchValue, teacherList, mid + 1, right); // Search the right half
        }
    }
}
