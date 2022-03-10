package com.example.incometax.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.incometax.Entity.DeductionEntity;
import com.example.incometax.Util.EntityModelUtil;
//import com.example.incometax.exception.DeductionEntityNotFoundException;
import com.example.incometax.exception.DeductionNotFoundException;
import com.example.incometax.model.Deduction;
import com.example.incometax.repository.DeductionRepository;

@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private DeductionRepository deductionRepository;

	// Save operation
	@Override
	public Deduction saveDeduction(Deduction deduction) {

		DeductionEntity deductionEntity = deductionRepository.save(EntityModelUtil.deductionModelToEntity1(deduction));

		return EntityModelUtil.deductionEntityToModel(deductionEntity);
	}

	// Read or View operation
	@Override
	public List<Deduction> fetchDeduction() {
		List<DeductionEntity> deduction = deductionRepository.findAll();

		return EntityModelUtil.deductionEntityToModelList(deduction);
	}
	// Read operation using id
	@Override
    public Deduction getDeductionById(int deductionId) throws DeductionNotFoundException {	
		Optional<DeductionEntity> optionalDeduction = deductionRepository.findById(deductionId);
		
		if(optionalDeduction.isEmpty()) {
			throw new DeductionNotFoundException("Sorry! Deduction is not existing with id: "+deductionId);
		}
		return EntityModelUtil.deductionEntityToModel(optionalDeduction.get());		
	}
	public List<DeductionEntity> fetchDeductionEntity() {
		return (List<DeductionEntity>) deductionRepository.findAll();
	}

	// Update operation
	@Override
	public Deduction updateDeduction(Deduction deduction) {

		Optional<DeductionEntity> optionalDeductionEntity = deductionRepository.findById(deduction.getDeductionId());

		if (optionalDeductionEntity.isEmpty()) {
			throw new DeductionNotFoundException("Sorry! Deduction is not existing with id: " + deduction.getDeductionId());
		}

		DeductionEntity updatedDeductionEntity = deductionRepository.save(EntityModelUtil.deductionModelToEntity1(deduction));

		return EntityModelUtil.deductionEntityToModel(updatedDeductionEntity);
	}
	// Delete operation
	@Override
	public void deleteDeductionById(int deductionId) {
		
		Optional<DeductionEntity> optionalDeductionEntity = deductionRepository.findById(deductionId);
		
		if (optionalDeductionEntity.isPresent()) {
			deductionRepository.deleteById(deductionId);
		} else {
		throw new DeductionNotFoundException("Sorry! deduction is not existing with id: " + deductionId);
		}			
	}
}
