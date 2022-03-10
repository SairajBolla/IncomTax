package com.example.incometax.Util;

import java.util.ArrayList;
import java.util.List;

import com.example.incometax.Entity.DeductionEntity;
import com.example.incometax.model.Deduction;

public class EntityModelUtil {

	public static  DeductionEntity deductionModelToEntity1(Deduction deduction) {

		DeductionEntity deductionEntity = new DeductionEntity();
		deductionEntity.setDeductionId(deduction.getDeductionId());
		deductionEntity.setFd(deduction.getFd());
		deductionEntity.setHouseloan(deduction.getHouseLoan());
		deductionEntity.setLip(deduction.getLIP());
		deductionEntity.setNsc(deduction.getNSC());
		deductionEntity.setPpf(deduction.getPPF());
		deductionEntity.setSss(deduction.getSSS());
		deductionEntity.setTutionfee(deduction.getTutionFee());
		deductionEntity.setUlip(deduction.getULIP());
		
		
		

		return deductionEntity;
	}

	public static Deduction deductionEntityToModel(DeductionEntity deductionEntity) {

		Deduction deduction = new Deduction();
		deduction.setDeductionId(deductionEntity.getDeductionId());
		deduction.setFd(deductionEntity.getFd());
		deduction.setHouseLoan(deductionEntity.getHouseloan());
		deduction.setLIP(deductionEntity.getLip());
		deduction.setNSC(deductionEntity.getNsc());
		deduction.setPPF(deductionEntity.getPpf());
		deduction.setSSS(deductionEntity.getSss());
		deduction.setTutionFee(deductionEntity.getTutionfee());
		deduction.setULIP(deductionEntity.getUlip());
		

		return deduction;
	}
public static List<Deduction> deductionEntityToModelList(List<DeductionEntity> entityList) {
		
		List<Deduction> deductiontList = new ArrayList<>();
		
		entityList.forEach(entity -> {
			Deduction deduction = new Deduction();
			deduction.setDeductionId(entity.getDeductionId());
			deduction.setFd(entity.getFd());
			deduction.setHouseLoan(entity.getHouseloan());
			deduction.setLIP(entity.getLip());
			deduction.setNSC(entity.getNsc());
			deduction.setPPF(entity.getPpf());
			deduction.setSSS(entity.getSss());
			deduction.setTutionFee(entity.getTutionfee());
			deduction.setULIP(entity.getUlip());
		
			deductiontList.add(deduction);
		});
		
		return deductiontList;

}


	}


