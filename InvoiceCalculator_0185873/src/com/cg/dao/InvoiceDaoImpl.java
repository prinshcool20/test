package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Invoice;


public class InvoiceDaoImpl implements InvoiceDao{
static Map<Integer,Invoice> inv = new HashMap<Integer,Invoice>();
	

	

	@Override
	public boolean addInvoice(Invoice e) {
		
		inv.put(e.getId(), e);
		
		return true;
	}

	@Override
	public Map<Integer, Invoice> getInvoice() {
		
		
		return inv;
	}
}
