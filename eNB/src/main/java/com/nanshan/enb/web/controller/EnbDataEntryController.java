package com.nanshan.enb.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanshan.enb.dao.OwnerDAO;
import com.nanshan.enb.dao.PolicyDAO;
import com.nanshan.enb.model.Owner;
import com.nanshan.enb.model.Policy;
import com.nanshan.enb.web.model.EnbDataEntryView;
import com.nanshan.enb.web.model.OwnerView;
import com.nanshan.enb.web.model.PolicyView;

@RestController
public class EnbDataEntryController {
	
	@Autowired
	private PolicyDAO policyDao;
	
	@Autowired
	private OwnerDAO ownerDao;
	
	@GetMapping("sayHello")//(value="sayHello",produces = "text/plain;charset=utf-8")
	public String sayHello() {
		return "你好, 現在是".concat(SimpleDateFormat.getInstance().format(new Date()));
	}
	
	@GetMapping("listCase")
	public List<EnbDataEntryView> listCase() {
		List<EnbDataEntryView> result = new ArrayList<EnbDataEntryView>();
		policyDao.findAll().stream().forEach(policyModel->{
			
			EnbDataEntryView enbDataEntryView = new EnbDataEntryView();
			
			PolicyView policyView = new PolicyView();
			BeanUtils.copyProperties(policyModel, policyView);
			enbDataEntryView.setPolicy(policyView);
			
			OwnerView ownerView = new OwnerView();
			Owner owner = ownerDao.findByParentId(policyModel.getPkId());
			if(owner!=null)
				BeanUtils.copyProperties(ownerDao.findByParentId(policyModel.getPkId()), ownerView);
			enbDataEntryView.setOwner(ownerView);
			
			result.add(enbDataEntryView);
		});
		return result;
	}
	
	@PostMapping("saveDataEnrty")
	public String saveDataEnrty(EnbDataEntryView model) {
		
		Policy policy = new Policy();
		
		BeanUtils.copyProperties(model.getPolicy(), policy);
		
		Owner owner = new Owner();
		
		BeanUtils.copyProperties(model.getOwner(), owner);
		
		return null;
	}
	
	
}
