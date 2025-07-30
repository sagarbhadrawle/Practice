package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.masai.dto.Medicine;
import com.masai.exception.SomethingWentWrongException;

public class MedicineDaoImpl implements MedicineDao {

	@Override
	public void addMedicine(Medicine medi) throws SomethingWentWrongException {
		// TODO Auto-generated method stub

		try (Connection con = Dbutilis.createConnection()){
			
			
			String st = "insert into medicine value(?,?,?,?,?,?)";
			
			PreparedStatement ps = com.prepareStatement(st);
			
			ps.setString(1,medi.getMed_id());
			ps.setString(2,medi.getName());
			ps.setString(3, medi.getCompany());
			ps.setDouble(4,medi.getPrice_Per_unit());
			ps.setDate(5,Date.valueOf(medi.getMfgdate()));
			ps.setDate(6,Date.valueOf(medi.getExpDate()));
			ps.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void updateMedicine(Medicine medi) throws SomethingWentWrongException {
			
		try(Connecton con = Dbutilis.createConnection()){
			
			String query = "update medicine set name = ? , company=? ,price_per_unit=?,MFGdATE =?, EXPDTA=? WHERE MED_ID = ?"
					
			st.setString(1, medigetName());
			st.setString(2, medi.getcompany)
					
		}

	}

	@Override
	public void deleteMedicine(String id) throws SomethingWentWrongException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Medicine> getMedicineList() throws SomethingWentWrongException {
		// TODO Auto-generated method stub
		return null;
	}

}
