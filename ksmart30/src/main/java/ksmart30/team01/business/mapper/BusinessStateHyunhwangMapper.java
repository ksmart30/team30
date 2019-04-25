package ksmart30.team01.business.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team01.business.domain.BusinessStateJinhaengHyunhwangDomain;

@Mapper
public interface BusinessStateHyunhwangMapper {

	List<TotalCode> getBusinessState1BonbuHyunhwangInfo();
	
	List<TotalCode> getBusinessState2BonbuHyunhwangInfo();
	
	List<TotalCode> getBusinessState3BonbuHyunhwangInfo();
	
	List<TotalCode> getBusinessState4BonbuHyunhwangInfo();
	
	List<TotalCode> getBusinessState5BonbuHyunhwangInfo();
	
	List<BusinessStateJinhaengHyunhwangDomain> getBusinessStateJinhaengHyunhwangInfo();

	List<BusinessStateJinhaengHyunhwangDomain> getSujuGubunInfo(TotalCode totalCode);

	List<BusinessStateJinhaengHyunhwangDomain> getJinhaengSangtaeInfo(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain);
}
