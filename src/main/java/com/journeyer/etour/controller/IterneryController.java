package com.journeyer.etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.journeyer.etour.modal.Iternery;
import com.journeyer.etour.repository.Iterneryrepo;

@RestController
@CrossOrigin
public class IterneryController {

	@Autowired
	Iterneryrepo irepo;
	
	@GetMapping(value="iternery/{sectormasterid}",headers = "Accept=application/json")
	public List<Iternery> getIternery(@PathVariable int sectormasterid)
	{
		return irepo.findByIternery(sectormasterid);
	}
}
