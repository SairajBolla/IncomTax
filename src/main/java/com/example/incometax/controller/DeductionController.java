package com.example.incometax.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.incometax.model.Deduction;
import com.example.incometax.service.DeductionService;

@RestController
@RequestMapping("/deduction")
public class DeductionController {
	
	private static final Logger logger = LoggerFactory.getLogger(DeductionController.class);
    

	 @Autowired 
	 private DeductionService deductionService;
	 
    // Save operation

		@PostMapping("/save")
		public ResponseEntity<Deduction> addDeduction(@RequestBody Deduction deduction) {
			logger.debug("");
			Deduction newDeduction = deductionService.saveDeduction(deduction);
			ResponseEntity<Deduction> responseEntity = new ResponseEntity<>(newDeduction, HttpStatus.CREATED);
			return responseEntity;
		}
 
    // Read operation
    @GetMapping("/View")
 
    public List<Deduction> fetchDeduction()
    {
    	List<Deduction> deduction = deductionService.fetchDeduction();
    	return deduction;
    }
 // Read operation using id
    @GetMapping("/get/{did}")
    public ResponseEntity<?> fetchDeductionDetails(@PathVariable("did") int deductionId) {
    	Deduction deduction = deductionService.getDeductionById(deductionId);
		return new ResponseEntity<>(deduction, HttpStatus.OK);
	}
 
    // Update operation
    @PutMapping("/update")
	public ResponseEntity<Deduction> updateDeduction(@RequestBody Deduction deduction) {
    	Deduction updateDeduction = deductionService.updateDeduction(deduction);
		return new ResponseEntity<>(updateDeduction, HttpStatus.OK);
	}
 
    // Delete operation
    @DeleteMapping("/delete/{did}")
	public ResponseEntity<?> deleteDeductionEntity(@PathVariable("did") int deductionId) {
    	deductionService.deleteDeductionById(deductionId);
		return new ResponseEntity<>("Deduction Deleted with id: "+deductionId, HttpStatus.OK);
  
		}
}