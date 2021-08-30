package com.htc.billing.service.apirest.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.billing.service.apirest.controller.ApiRestControllerIface;
import com.htc.billing.service.apirest.services.Impl.ApiRestServicesImpl;
import com.htc.billing.service.apirest.soapclasses.NewBillingRequest;
import com.htc.billing.service.apirest.soapclasses.UpdateBillingRequest;


@RestController
public class ApiRestControllerImpl implements ApiRestControllerIface{

	@Autowired
	private ApiRestServicesImpl service;
	
	@GetMapping("/billingservice/api/{billCode}")
	public ResponseEntity<Object> findByCode(@PathVariable("billCode") long billingCode)  {
		return service.findByBillingCode(billingCode);
	}
	
	@GetMapping("/billingservice/api/")
	public ResponseEntity<Object> findAllBills(){
		return service.findAllBillings();
	}
	
	@PostMapping("/billingservice/api/")
	public ResponseEntity<Object> createBilling(@RequestBody NewBillingRequest request){
		return service.createBilling(request);
	}

	@PutMapping("/billingservice/api/")
	public ResponseEntity<Object> updateBilling(@RequestBody UpdateBillingRequest request) {
		return service.updateBilling(request);
	}

	@DeleteMapping("/billingservice/api/{billCode}")
	public ResponseEntity<Object> deleteBilling(@PathVariable("billCode") long billingCode) {
		return service.deleteBill(billingCode);
	}
}