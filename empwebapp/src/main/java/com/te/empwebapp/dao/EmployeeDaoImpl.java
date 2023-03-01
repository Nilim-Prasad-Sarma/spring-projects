package com.te.empwebapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.empwebapp.entity.Employee;
import com.te.empwebapp.exception.EmployeeException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean register(Employee employee) {

		boolean isRegistered = false;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			isRegistered = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isRegistered;
	}

	@Override
	public Employee authenticate(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		Employee employee2 = manager.find(Employee.class, employee.getEmpId());
		if (employee2 != null) {
			if (employee2.getPassword().equals(employee.getPassword())) {
				return employee2;
			} else {
				throw new EmployeeException("Invalid password");
			}
		} else {
			throw new EmployeeException("Invalid Id");
		}

	}

	@Override
	public boolean deleteData(String empId) {
		boolean isDeleted = false;

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, empId);
		if (employee != null) {
			manager.remove(employee);
			transaction.commit();
			isDeleted = true;
		}
		return isDeleted;

	}

	@Override
	public List<Employee> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		String getAll = "from Employee";
		Query createQuery = manager.createQuery(getAll);
		List<Employee> resultList = createQuery.getResultList();
		if (resultList != null) {
			return resultList;
		}
		throw new EmployeeException("No data is present!!");
	}

}
