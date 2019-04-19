package ksmart30.team01.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.domain.BusinessSearch1;
import ksmart30.team01.business.mapper.BusinessYesanSearchMapper;
@Service
public class BusinessYesanSearchService {
		@Autowired
		BusinessYesanSearchMapper businessYesanSearchMapper;
		
		//사업성코드 검색1
		public List<BusinessSearch1> businessOutputSearch1(BusinessSearch1 businessSearch1){
			System.out.println("사업성코드 검색1 서비수! businessOutputSearch1 BusinessYesanOutputService");
			List<BusinessSearch1> searchList1 = businessYesanSearchMapper.businessOutputSearch1(businessSearch1);
		return searchList1; 
		}
		//사업성검토 검색1(부서셀렉트박스)
		public List<Map<String, String>> businessOutputSearch1Dept(){
			System.out.println("사업성코드 검색1(부서 셀렉트박스) 서비수! businessOutputSearch1 BusinessYesanOutputService");
			List<Map<String, String>> selectDept = businessYesanSearchMapper.businessOutputSearch1Dept();
			return selectDept;
		}
		//사업성검토 검색1 (프로젝트코드 팝업전체리스트)
		public List<BusinessSearch1> businessPjtCd(BusinessSearch1 businessSearch1){
			System.out.println("사업성검토 검색1 (프로젝트코드 팝업전체리스트) 서비수! businessOutputSearch1 BusinessYesanOutputService");
			List<BusinessSearch1> pjtCd = businessYesanSearchMapper.businessPjtCd(businessSearch1);
			return pjtCd;
		}
		//사업성코드 검색2
		public List<Business> businessOutputSearch2(Business business){
			System.out.println("사업성코드 검색2 서비수! businessOutputSearch2 BusinessYesanOutputService");
			List<Business> searchList =  businessYesanSearchMapper.businessOutputSearch2(business);
		//프로젝트코드+타입 합처서 보내기
		for(int i=0; i<searchList.size(); i++) {
			business = searchList.get(i);
			String pjtCd = business.getPJT_CD();
			String pjtType = business.getPJT_TYPE();
			String pjtCT = pjtCd+pjtType;
			business.setPJT_CD(pjtCT);
		}
		return searchList;
		}
}
