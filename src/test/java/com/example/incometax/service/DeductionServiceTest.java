package com.example.incometax.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.incometax.Entity.DeductionEntity;
import com.example.incometax.Util.EntityModelUtil;
import com.example.incometax.model.Deduction;
import com.example.incometax.repository.DeductionRepository;

public class DeductionServiceTest {
	
	@InjectMocks
	private DeductionServiceImpl deductionService = new DeductionServiceImpl();;

	@Mock
	private DeductionRepository deductionRepository;
	
	@Mock
	private EntityModelUtil entityModelUtil;
	
	@Test
    void testSaveProduct() {
		@SuppressWarnings("unused")
		int id=1;
		Deduction deduction = new Deduction();
		deduction.setDeductionId(1);
		deduction.setFd(20000);
		deduction.setHouseLoan(15000);
		deduction.setLIP(0);
		deduction.setNSC(0);
		deduction.setPPF(25000);
		deduction.setSSS(0);
		deduction.setTutionFee(25000);
		deduction.setULIP(0);

		DeductionEntity deductionEntity = new DeductionEntity();
		deductionEntity.setDeductionId(deduction.getDeductionId());
		deductionEntity.setFd(deduction.getFd());
		deductionEntity.setHouseloan(deduction.getHouseLoan());
		deductionEntity.setLip(deduction.getLIP());
		
		deductionEntity.setNsc(deduction.getNSC());
		deductionEntity.setPpf(deduction.getPPF());
	
		deductionEntity.setTutionfee(deduction.getTutionFee());
		deductionEntity.setUlip(deduction.getULIP());
		
				
		when(EntityModelUtil.deductionModelToEntity1(deduction)).thenReturn(deductionEntity);
		
		when(EntityModelUtil.deductionEntityToModel(deductionEntity)).thenReturn(deduction);
		
     	when(deductionRepository.save(deductionEntity)).thenReturn(deductionEntity);		
    	
     	deduction = deductionService.saveDeduction(deduction);		
		
		assertEquals(deductionEntity.getDeductionId(), deduction.getDeductionId());	
    }
	@Test
	 void testdeleteDeductionById() {
		int id = 1;
		DeductionEntity deductionEntity = new DeductionEntity();
		deductionEntity.setDeductionId(1);
		deductionEntity.setFd(20000);
		deductionEntity.setHouseloan(15000);
		deductionEntity.setLip(0);
		deductionEntity.setNsc(0);
		deductionEntity.setPpf(25000);
		deductionEntity.setSss(0);
		deductionEntity.setTutionfee(25000);
		deductionEntity.setUlip(0);


		
		Optional<DeductionEntity> optionalDeduction = Optional.of(deductionEntity);
		
		when(deductionRepository.findById(id)).thenReturn(optionalDeduction);

		
		deductionService.deleteDeductionById(deductionEntity.getDeductionId());
		
		verify(deductionRepository,times(1)).deleteById(id);
		
		doNothing().when(deductionRepository).deleteById(deductionEntity.getDeductionId());	
	}

}

