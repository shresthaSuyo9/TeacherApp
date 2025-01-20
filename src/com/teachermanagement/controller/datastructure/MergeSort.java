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

public class MergeSort {

    // Merge Sort by salary
    public List<TeacherModel> sortBySalary(List<TeacherModel> unsortedData, boolean isDesc) {
        if (unsortedData.size() <= 1) {
            return unsortedData;  // Base case: a list of one element is already sorted
        }

        // Divide the list into two halves
        int mid = unsortedData.size() / 2;
        List<TeacherModel> left = unsortedData.subList(0, mid);
        List<TeacherModel> right = unsortedData.subList(mid, unsortedData.size());

        // Recursively sort each half
        left = sortBySalary(left, isDesc);
        right = sortBySalary(right, isDesc);

        // Merge the sorted halves
        return merge(left, right, isDesc);
    }

    // Merge two sorted lists
    private List<TeacherModel> merge(List<TeacherModel> left, List<TeacherModel> right, boolean isDesc) {
        List<TeacherModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two sorted lists based on salary comparison
        while (i < left.size() && j < right.size()) {
            if (isDesc) {
                if (left.get(i).getSalary() > right.get(j).getSalary()) {
                    merged.add(left.get(i));
                    i++;
                } else {
                    merged.add(right.get(j));
                    j++;
                }
            } else {
                if (left.get(i).getSalary() < right.get(j).getSalary()) {
                    merged.add(left.get(i));
                    i++;
                } else {
                    merged.add(right.get(j));
                    j++;
                }
            }
        }

        // Add remaining elements (if any) from either left or right
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}
