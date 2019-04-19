package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team01.business.domain.Business;
import ksmart30.team01.business.domain.BusinessSearch1;
@Mapper
public interface BusinessYesanSearchMapper {
	
	//사업성검토 검색1
	List<BusinessSearch1> 	businessOutputSearch1(BusinessSearch1 businessSearch1);
	//사업성검토 검색1 부서별 셀렉트박스
	List<Map<String ,String>> businessOutputSearch1Dept();
	//사업성검토 검색1 (프로젝트코드 팝업전체리스트)
	List<BusinessSearch1> businessPjtCd(BusinessSearch1 businessSearch1);
	//사업성검토 검색2
	List<Business> businessOutputSearch2(Business business);
}
