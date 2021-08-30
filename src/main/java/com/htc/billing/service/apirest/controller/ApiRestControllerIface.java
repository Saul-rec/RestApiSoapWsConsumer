package com.htc.billing.service.apirest.controller;

import org.springframework.http.ResponseEntity;

import com.htc.billing.service.apirest.soapclasses.NewBillingRequest;
import com.htc.billing.service.apirest.soapclasses.UpdateBillingRequest;

public interface ApiRestControllerIface {

	public ResponseEntity<Object> findByCode(long billingCode);
	
	public ResponseEntity<Object> findAllBills();
	
	public ResponseEntity<Object> createBilling(NewBillingRequest request);
	
	public ResponseEntity<Object> updateBilling(UpdateBillingRequest request);
		
	public ResponseEntity<Object> deleteBilling(long billingCode);
	
}
