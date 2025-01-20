/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teachermanagement.controller.datastructure;

import com.teachermanagement.model.TeacherModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SuyogShrestha23048669
 */
public class SelectionSort {
    public List<TeacherModel> sortByTeacherId(List<TeacherModel> unsortedData, boolean isDesc) {
        
        List<TeacherModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getTeacherId() > dataToSort.get(minIndex).getTeacherId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getTeacherId() < dataToSort.get(minIndex).getTeacherId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
           TeacherModel tempTeacher = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempTeacher);
        }
        return dataToSort;
    }
    
     public List<TeacherModel> sortByName(List<TeacherModel> unsortedData, boolean isDesc) {
        
        List<TeacherModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getTeacherName().compareToIgnoreCase(dataToSort.get(minIndex).getTeacherName())>0 ) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getTeacherName().compareToIgnoreCase(dataToSort.get(minIndex).getTeacherName())<0) {
                        minIndex = j;
                    }
                }
            }
            //swap
            TeacherModel tempTeacher = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempTeacher);
        }
        return dataToSort;
    }
}
