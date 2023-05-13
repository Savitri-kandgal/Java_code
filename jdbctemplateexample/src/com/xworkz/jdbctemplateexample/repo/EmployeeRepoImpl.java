package com.xworkz.jdbctemplateexample.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xworkz.jdbctemplateexample.dto.EmployeeDTO;

@Component
//@AllArgsConstructor
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public EmployeeRepoImpl() {
		System.out.println("EmployeeRepoImpl is running in no-args constructor");
	}

	@Override
	public boolean save(EmployeeDTO dto) {
		System.out.println("Repo: save() is running...");
		String insert = "insert into employee(FNAME, LNAME, SALARY, ADDRESS) values('" + dto.getFName()
				+ "', '" + dto.getLName() + "', '" + dto.getSalary() + "', '" + dto.getAddress() + "')";
		int rows = jdbcTemplate.update(insert);
		System.out.println("No. of rows inserted: " + rows);
		return true;
	}

	public EmployeeDTO findById(int id) {
		String read = "select * from employee where id=2";
	//	EmployeeDTO dto =jdbcTemplate.queryForObject("select * from employee where id=?", BeanPropertyRowMapper.newInstance(EmployeeDTO.class), 2);
		EmployeeDTO dto = jdbcTemplate.queryForObject(read, BeanPropertyRowMapper.newInstance(EmployeeDTO.class));
		return dto;

	}

}





/*
 * List list = jdbcTemplate.query(read, new RowMapper() { public EmployeeDTO
 * mapRow(ResultSet result, int rowNum) throws SQLException { EmployeeDTO
 * employee = new EmployeeDTO(); employee.setId(result.getInt("ID"));
 * employee.setFName(result.getString("FIRST_NAME"));
 * employee.setLName(result.getString("LAST_NAME"));
 * employee.setSalary(result.getInt("SALARY"));
 * employee.setAddress(result.getString("ADDRESS")); return employee; } });
 * return list;
 */