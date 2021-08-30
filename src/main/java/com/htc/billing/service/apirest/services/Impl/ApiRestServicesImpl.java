package com.htc.billing.service.apirest.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.htc.billing.service.apirest.exceptions.ErrorDetails;
import com.htc.billing.service.apirest.services.ApiRestServicesIface;
import com.htc.billing.service.apirest.soapclasses.DeleteBillingRequest;
import com.htc.billing.service.apirest.soapclasses.DeleteBillingResponse;
import com.htc.billing.service.apirest.soapclasses.FindAllBillingRequest;
import com.htc.billing.service.apirest.soapclasses.FindAllBillingResponse;
import com.htc.billing.service.apirest.soapclasses.FindByBillingCodeRequest;
import com.htc.billing.service.apirest.soapclasses.FindByBillingCodeResponse;
import com.htc.billing.service.apirest.soapclasses.NewBillingRequest;
import com.htc.billing.service.apirest.soapclasses.NewBillingResponse;
import com.htc.billing.service.apirest.soapclasses.UpdateBillingRequest;
import com.htc.billing.service.apirest.soapclasses.UpdateBillingResponse;

@Service
public class ApiRestServicesImpl implements ApiRestServicesIface {
	private static final String SOAP_URI = "http://localhost:8080/ws/billingService";
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	
	private WebServiceTemplate template;
	private ErrorDetails details = new ErrorDetails();
	
	public ResponseEntity<Object> findByBillingCode(long code)  {
		template = new WebServiceTemplate(marshaller);
		FindByBillingCodeRequest request = new FindByBillingCodeRequest();
		request.setBillingCode(code);
		FindByBillingCodeResponse response;
		try {
			response = (FindByBillingCodeResponse) template.marshalSendAndReceive(SOAP_URI, request);
		} catch (RuntimeException e) {
			
			details.setServiceCode("404: NOT FOUND");
			details.setMessage("The billing code: " + code + " was not found in DB");
			
			return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<Object> findAllBillings(){
		template = new WebServiceTemplate(marshaller);
		FindAllBillingRequest request = new FindAllBillingRequest();
		FindAllBillingResponse response;
		try {
			response = (FindAllBillingResponse) template.marshalSendAndReceive(SOAP_URI, request);
		} catch (RuntimeException e) {
			details.setServiceCode("404");
			details.setMessage("Nothing to show yet");
			return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);	
	}

	public ResponseEntity<Object> createBilling(NewBillingRequest request) {
		template = new WebServiceTemplate(marshaller);
		if (request == null) {
			details.setServiceCode("400: BAD REQUEST");
			details.setMessage("All data is required, please check it again");
			return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
		}
		
		NewBillingRequest newBill = new NewBillingRequest();
		newBill.setCodEmployee(request.getCodEmployee());
		newBill.setNameClient(request.getNameClient());
		newBill.setPaymentType(request.getPaymentType());
		
		for (int i = 0; i < request.getProductDetails().size(); i++) {
			NewBillingRequest.ProductDetails pdetails = new NewBillingRequest.ProductDetails();
			pdetails.setCodProduct(request.getProductDetails().get(i).getCodProduct());
			pdetails.setQuantity(request.getProductDetails().get(i).getQuantity());
			newBill.getProductDetails().add(pdetails);
			
		}
		
		NewBillingResponse response;
		try {
			response = (NewBillingResponse) template.marshalSendAndReceive(SOAP_URI, newBill);
		} catch (Exception e) {
			details.setServiceCode("500");
			details.setMessage(e.toString());
			return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public ResponseEntity<Object> updateBilling(UpdateBillingRequest request) {
		template = new WebServiceTemplate(marshaller);
		UpdateBillingResponse response;
		if (request == null) {
			details.setServiceCode("400: BAD REQUEST");
			details.setMessage("All data is required, please check it again");
			
			return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
		}
		try {
			response = (UpdateBillingResponse) template.marshalSendAndReceive(SOAP_URI, request);
		} catch (RuntimeException e) {
			details.setServiceCode("500");
			details.setMessage(e.toString());
			return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
		}
	 return new ResponseEntity<>(response, HttpStatus.OK);
	}


	public ResponseEntity<Object> deleteBill(long billingCode) {
		template = new WebServiceTemplate(marshaller);
		DeleteBillingRequest request = new DeleteBillingRequest();
		request.setBillingCode(billingCode);
		DeleteBillingResponse response;
		try {
			response = (DeleteBillingResponse) template.marshalSendAndReceive(SOAP_URI, request);
		} catch (Exception e) {
			details.setServiceCode("500");
			details.setMessage(e.toString());
			return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
