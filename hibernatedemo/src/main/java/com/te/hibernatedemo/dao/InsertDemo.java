package com.te.hibernatedemo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.bean.EmployeeAddressInfo;
import com.te.hibernatedemo.bean.EmployeePrimaryInfo;
import com.te.hibernatedemo.bean.EmployeeSecondaryInfo;

public class InsertDemo {
	public static void main(String[] args) {

		EmployeePrimaryInfo employeePrimaryInfo = new EmployeePrimaryInfo();
		employeePrimaryInfo.setEmpName("abc");
		employeePrimaryInfo.setEmpAge(29);
		employeePrimaryInfo.setDesignation("developer");
		
		EmployeeSecondaryInfo employeeSecondaryInfo = new EmployeeSecondaryInfo();
		
		employeeSecondaryInfo.setAadharNo(123456789L);
		employeeSecondaryInfo.setFatherName("qwsedrfgthj");
		employeeSecondaryInfo.setMotherName("qwer");
		employeeSecondaryInfo.setPanNo("QWer1234");
		employeeSecondaryInfo.setInfo(employeePrimaryInfo);
		
		
		EmployeeAddressInfo addressInfo = new EmployeeAddressInfo();
		addressInfo.setAddressType("permanant");
		addressInfo.setCity("Blr");
		addressInfo.setCountry("India");
		addressInfo.setInfo(employeePrimaryInfo);
		
		
		EmployeeAddressInfo addressInfo1 = new EmployeeAddressInfo();
		addressInfo1.setAddressType("temp");
		addressInfo1.setCity("Tn");
		addressInfo1.setCountry("India");
		addressInfo1.setInfo(employeePrimaryInfo);
		
		ArrayList<EmployeeAddressInfo> addressInfos = new ArrayList<EmployeeAddressInfo>();
		addressInfos.add(addressInfo);
		addressInfos.add(addressInfo1);
		
		
		
		
		employeePrimaryInfo.setSecondaryInfo(employeeSecondaryInfo);
		employeePrimaryInfo.setAddressInfo(addressInfos);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employeePrimaryInfo);
		transaction.commit();

	}
}
