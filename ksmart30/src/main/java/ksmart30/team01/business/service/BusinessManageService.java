package ksmart30.team01.business.service;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.BusinessMarket;
import ksmart30.team01.business.mapper.BusinessManageMapper;

@Service
public class BusinessManageService {
	@Autowired
	BusinessManageMapper businessManageMapper;

	// 1.1.3 사업수행 승인현황
	public List<Map<String, Object>> businessManageSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageList(vo);

	}

	// 1.1.1사업수행결정서 프로젝트 리스트 좌측
	public List<Map<String, Object>> businessManageViewSelect(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageViewList(vo);

	}

	// 1.1.1사업수행결정서(승인)프로젝트목록 클릭시 우측에 검색
	public Map<String, Object> businessManageView(BusinessMarket vo) {
		return businessManageMapper.getBusinessManageView(vo);
	}
	// 거래처 코드
	public List<Map<String,String>> CustCode(String cust){
		List<Map<String,String>> list = businessManageMapper.CustCodeList(cust);
		
		return list;
	}
	// 부서 코드
	public List<Map<String,String>> DeptCode(String dept){
		List<Map<String,String>> list = businessManageMapper.DeptCodeList(dept);
		
		return list;
	}
	
	// 사원 검색
	public List<Map<String,String>> ResultDeptList(Map<String,Object> searchMap){

		return businessManageMapper.ResultEmpList(searchMap);
	}
	
	// 사업수행결정서 저장
	public void businessManageViewInsert(BusinessMarket vo) {
		 String Gubun = vo.getBIZ_GBN(); //프로젝트 타입 
		 String BUSI_SEQ = "";
		 
		if(Gubun.equals("10")) {
			vo.setPJT_TYPE("F");
		}else if(Gubun.equals("16")){
			vo.setPJT_TYPE("F");
		}else {
			vo.setPJT_TYPE("C");  //BUSI_SEQ
		}
		BUSI_SEQ = businessManageMapper.numUp();  //일련번호 자동증가 
		vo.setBUSI_SEQ("00"+BUSI_SEQ);
	
		businessManageMapper.businessManageViewInsert(vo);
		
	}
	
	//사업 수행결정서 승인및  업데이트 businessManageViewUpdate
	public void businessManageSeunginViewUpdate(BusinessMarket vo) {
		
		
		String BU_YY = vo.getBUSI_YY2();  // PJT 코드 만들기
		BU_YY = BU_YY.substring(2,4);
		String BUSI_SEQ = vo.getBUSI_SEQ();  
		BUSI_SEQ = BUSI_SEQ.substring(1,4);
		vo.setPJT_CD(BU_YY+BUSI_SEQ);
		System.out.println(vo.getPJT_CD());
		
		String Gubun = vo.getBIZ_GBN(); //프로젝트 타입 
		 
		 
		if(Gubun.equals("10")) {
			vo.setPJT_TYPE("F");
		}else if(Gubun.equals("16")){
			vo.setPJT_TYPE("F");
		}else {
			vo.setPJT_TYPE("C");  //BUSI_SEQ
		}
		
		businessManageMapper.businessManageSeunginViewUpdate(vo);
		businessManageMapper.businessManageSeunginViewInsert1(vo); //SM3000
		businessManageMapper.businessManageSeunginViewInsert2(vo); //PS1000
	}

	public void businessManageViewDelete(BusinessMarket vo) {
		
		businessManageMapper.businessManageViewDelete(vo);
		
		
	}
	
	



}
