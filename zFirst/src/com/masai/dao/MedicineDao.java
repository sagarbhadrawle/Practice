package com.masai.dao;

import java.util.List;

import com.masai.dto.Medicine;
import com.masai.exception.SomethingWentWrongException;

public interface MedicineDao {

	
	public void addMedicine(Medicine medi) throws SomethingWentWrongException;
	public void updateMedicine(Medicine medi) throws SomethingWentWrongException;
	public void deleteMedicine(String id) throws SomethingWentWrongException;
	public List<Medicine> getMedicineList() throws SomethingWentWrongException;
}
