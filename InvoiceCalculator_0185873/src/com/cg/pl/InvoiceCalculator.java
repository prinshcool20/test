package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cg.bean.Invoice;

import com.cg.service.InvoiceServiceImpl;
import com.cg.service.Validator;


public class InvoiceCalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int invoice_id=0;
		int weight=0;
		 int distance=0;
		 double amount=0.0;
	    double cgst=0.0;
	    double sgst=0.0;
	    String input="";
	    
	    InvoiceServiceImpl service = new InvoiceServiceImpl();
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Weight:-"); 		//input for weight........
		  
		while(true)					//for validating weight..........
		  {
			  input=br.readLine();
			 
			  boolean ch1=Validator.validatedata(input, Validator.weight);
			  if(ch1==true)
			  {
				  try {
					  weight=Integer.parseInt(input);
					  break;
				  }
				  catch(NumberFormatException e)
			  
			  {
				 System.out.println("Weight Should be in numaric..please enter properly"); 
			  }
		  }
			  else
			  {
				  System.out.println("Weight Should be more then 1g");
			  }
		  
		  }			//End of While loop..............................................
		
		
		System.out.println("Enter Distance:-");				//input for distance
		while(true)					//for validating distance..........
		  {
			  input=br.readLine();
			 
			  boolean ch1=Validator.validatedata(input, Validator.weight);
			  if(ch1==true)
			  {
				  try {
					  distance=Integer.parseInt(input);
					  break;
				  }
				  catch(NumberFormatException e)
			  
			  {
				 System.out.println("Distance Should be in numaric..please enter properly"); 
			  }
		  }
			  else
			  {
				  System.out.println("Distance Should be less then 100Km");
			  }
		  
		  }			//End of While loop..............................................
		 int min=4; 
		 int max=5;
		 invoice_id=(int)(Math.random()*((max-min)+1))+min;; 			//for generating Invoice number
		
		 //Calculating TransportCharge...........
		 amount=service.calculateInvoice(weight, distance);
		 //Calculating GST..................
		 cgst=amount*3.5;
		 sgst=amount*3.5;
		 
		 //Saving Invoice...................
		 Invoice i= new Invoice(invoice_id,weight,distance,amount,cgst,sgst);
		 
	      service.addInvoice(i);
	     
	      System.out.println("Invoice Generated");
		
	    
	      //to display Invoice..............................
	      Map <Integer,Invoice> accmap=service.getInvoice();
 	     Collection<Invoice> vc = accmap.values();
 	    {
			Iterator<Invoice>it=vc.iterator();
			while(it.hasNext()) {
				Invoice s=it.next();
				System.out.println(s+"");
			}
			System.out.println();
 	     
 	     
 	    
		
		
		
		
		
	}

}}

