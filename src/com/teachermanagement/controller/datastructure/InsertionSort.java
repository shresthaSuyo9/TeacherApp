/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teachermanagement.controller.datastructure;
/**
 *
 * @author SuyogShrestha23048669
 */
import com.teachermanagement.model.TeacherModel;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    // Insertion sort by name (String)
    public List<TeacherModel> sortByName(List<TeacherModel> unsortedData, boolean isDesc) {
        
        List<TeacherModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 1; i < dataToSort.size(); i++) {
            TeacherModel currentTeacher = dataToSort.get(i);
            int j = i - 1;

            // Compare and shift elements
            while (j >= 0 && (isDesc ? currentTeacher.getTeacherName().compareToIgnoreCase(dataToSort.get(j).getTeacherName()) > 0
                                      : currentTeacher.getTeacherName().compareToIgnoreCase(dataToSort.get(j).getTeacherName()) < 0)) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }
            // Insert the current element into its correct position
            dataToSort.set(j + 1, currentTeacher);
        }
        return dataToSort;
    }
}
