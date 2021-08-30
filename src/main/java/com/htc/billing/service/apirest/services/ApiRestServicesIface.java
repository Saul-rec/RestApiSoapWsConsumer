package com.htc.billing.service.apirest.services;

import org.springframework.http.ResponseEntity;

import com.htc.billing.service.apirest.soapclasses.NewBillingRequest;
import com.htc.billing.service.apirest.soapclasses.UpdateBillingRequest;

public interface ApiRestServicesIface {

	public ResponseEntity<Object> findByBillingCode(long billingCode);
	
	public ResponseEntity<Object> findAllBillings();
	
	public ResponseEntity<Object> createBilling(NewBillingRequest request);
	
	public ResponseEntity<Object> updateBilling(UpdateBillingRequest request);
	
	public ResponseEntity<Object> deleteBill(long billingCode);
	
	
}
