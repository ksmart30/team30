package ksmart30.team01.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart30.team01.business.mapper.BusinessYesanAdmitMapper;


@Service
@Transactional
public class BusinessYesanAdmitService {

@Autowired BusinessYesanAdmitMapper businessYesanAdmitMapper;
	
	public List<Map<String,String>> getDeptList(){
		
		return businessYesanAdmitMapper.getDeptList();
	}

	public List<Map<String, String>> getProjectList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getProjectList(searchMap);
	}

	public List<Map<String, String>> getResultProjectList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getResultProjectList(searchMap);
	}

	public List<Map<String, String>> getResultDeptList(Map<String, Object> searchMap) {
		
		return businessYesanAdmitMapper.getResultEmpList(searchMap);
	}

	public Map<String, Object> getResultProject(String PJT_CD) {
		
		return businessYesanAdmitMapper.getResultProject(PJT_CD);
	}
}
