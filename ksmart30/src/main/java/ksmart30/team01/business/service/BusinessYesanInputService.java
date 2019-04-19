package ksmart30.team01.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team01.business.mapper.BusinessYesanInputMapper;

@Service
@Transactional
public class BusinessYesanInputService {
	
	@Autowired BusinessYesanInputMapper businessYesanInputMapper;
	
	public List<Map<String,String>> getDeptList(){
		return businessYesanInputMapper.getDeptList();
	}
}
