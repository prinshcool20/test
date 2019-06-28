package com.cg.service;

import java.util.Map;

import com.cg.bean.Invoice;
import com.cg.bean.Invoice.InvoiceService;
import com.cg.dao.InvoiceDao;
import com.cg.dao.InvoiceDaoImpl;

public class InvoiceServiceImpl implements Invoiceservice {

	InvoiceDao dao = new InvoiceDaoImpl();
	

	@Override
	public boolean addInvoice(Invoice e) {
		// TODO Auto-generated method stub
			return dao.addInvoice(e);
	}

	@Override
	public Map<Integer, Invoice> getInvoice() {
		// TODO Auto-generated method stub
		return dao.getInvoice();
	}

	@Override
	public double calculateInvoice(int weight, int distance) {
		// TODO Auto-generated method stub
		double transportCharge=weight*(distance*2);
		return transportCharge;
	}

}
