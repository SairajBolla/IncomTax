package com.example.incometax.service;

import java.util.List;

import com.example.incometax.model.Deduction;

public interface DeductionService { 
 // Save operation
 	public Deduction saveDeduction(Deduction deduction);

 	// view by ID
      public Deduction getDeductionById(int deductionId);
 	
     // Read operation
 	public List<Deduction> fetchDeduction();

     //Update operation
 	public Deduction updateDeduction(Deduction deduction);

     //Delete operation
     public void deleteDeductionById(int deductionId);
     

}