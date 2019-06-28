package com.cg.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.cg.bean.Invoice;


public interface Invoiceservice {
	Queue<String> queue=new ConcurrentLinkedQueue<>();
	public boolean addInvoice(Invoice e);
	public Map <Integer,Invoice> getInvoice();
	 public double calculateInvoice(int weighr, int distance); 
	 
	 public default void printEmployeedetails(Invoice e)
		{
			Iterator<String>it=queue.iterator();
			while(it.hasNext()) {
				String s=it.next();
				System.out.println(s+"");
			}
			System.out.println();
		
			System.out.println("=====================================");
			//System.out.println("Details for Employee ID. :-"+e.getE_id());
			//System.out.println("Employee Name :- "+e.getE_name());
			//System.out.println("Employee Salary :- "+e.getE_salary());
			//System.out.println("Employee Designation :- "+e.getE_designation());
			//System.out.println("Insurance Scheme :- "+e.getE_insurance_scheme());
			System.out.println("=====================================");
		      
			
		}

}
