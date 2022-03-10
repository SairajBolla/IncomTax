package com.example.incometax.service;

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
import com.example.incometax.repository.DeductionRepository;

public class DeductionServiceTest1 {

	@InjectMocks
	private DeductionServiceImpl deductionService = new DeductionServiceImpl();;

	@Mock
	private DeductionRepository deductionRepository;

	@Mock
	private EntityModelUtil entityModelUtil;

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

		verify(deductionRepository, times(1)).deleteById(id);

		doNothing().when(deductionRepository).deleteById(deductionEntity.getDeductionId());
	}
}