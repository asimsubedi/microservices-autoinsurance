/**
 * 
 */
package com.ektha.quote.nameandadress.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.quote.nameandadress.dao.NameAddressDAOV1;
import com.ektha.quote.nameandadress.model.NameAndAddress;

/**
 * @author AsimSubedi
 *
 */
@RestController
@RequestMapping(value = "api/v1")
public class NameAddressControllerV1 {
	
	/*
	 * @GetMapping("company") public String getCompany() { return "Ektha"; }
	 */
	
	@Autowired
	private NameAddressDAOV1 nmdDAO;
	
	@PostMapping("nameaddress")
	public NameAndAddress add(@RequestBody NameAndAddress nmd) {
		return nmdDAO.addNameAndAddress(nmd);
	}
	
	@GetMapping("nameaddress")
	public List<NameAndAddress> fetch(){
		
		return nmdDAO.fetchAllNameAddress();
	}
	
	@GetMapping("nameaddress/{id}")
	public NameAndAddress fetch(@PathVariable("id") String id) {
		
		return nmdDAO.fetchNameAddress(id);
	}
	
	@PutMapping("update")
	public NameAndAddress update(@RequestBody NameAndAddress nmd) {
		return nmdDAO.updateNameAndAddress(nmd.getId(), nmd);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean delete(@PathVariable("id") String id) {
		
		return nmdDAO.deleteNameAddress(id);
	}
	
	

}
