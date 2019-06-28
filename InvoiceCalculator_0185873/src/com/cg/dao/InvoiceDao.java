package com.cg.dao;

import java.util.Map;

import com.cg.bean.Invoice;



public interface InvoiceDao {

	public boolean addInvoice(Invoice e);
	
	public Map <Integer,Invoice> getInvoice();

}
