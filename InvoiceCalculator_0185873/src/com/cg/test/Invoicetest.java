package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import com.cg.bean.Invoice;
import com.cg.dao.InvoiceDaoImpl;




class Invoicetest {
	Invoice inv=new Invoice(5,25,60,52.6,55.2,55.2);
	static InvoiceDaoImpl dao;

	@BeforeAll
	public static void beforeallTest() {
		System.out.println("Before All Tests");
		dao=new InvoiceDaoImpl();
		}
	@AfterAll
	public static void afterAllTest() {
		System.out.println("After All Tests");
		dao=null;
	}
	@Test
	void testAddInvoice() {
		assertEquals(true,dao.addInvoice(inv));
	}

	@Test
	void testDisplayInvoice() {
		dao.addInvoice(inv);
		assertEquals(inv,dao.getInvoice());
	}
}
