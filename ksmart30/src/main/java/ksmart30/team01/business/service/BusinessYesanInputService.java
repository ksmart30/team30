package ksmart30.team01.business.service;


import java.util.HashMap;
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
	
	public List<Map<String,String>> getProjectList(Map<String,Object> searchMap){
		return businessYesanInputMapper.getProjectList(searchMap);
	}
	
	public List<Map<String,String>> getResultProjectList(Map<String,Object> searchMap){
		
		return businessYesanInputMapper.getResultProjectList(searchMap);
	}
	
	public List<Map<String,String>> getResultDeptList(Map<String,Object> searchMap){
	
		return businessYesanInputMapper.getResultEmpList(searchMap);
	}
	
	public Map<String,Object> getResultProject (String PJT_CD){
		
		return businessYesanInputMapper.getResultProject(PJT_CD);
	}
}
