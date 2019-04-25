package ksmart30.team01.business.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.domain.TotalCode;
import ksmart30.team01.business.domain.BusinessStateJinhaengHyunhwangDomain;
import ksmart30.team01.business.mapper.BusinessStateHyunhwangMapper;

@Service
public class BusinessStateHyunhwangService {
@Autowired
BusinessStateHyunhwangMapper businessStateHyunhwangMapper;
	
	public Map<String, Object> businessStateHyunhwangList(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<TotalCode> list1 = businessStateHyunhwangMapper.getBusinessState1BonbuHyunhwangInfo();
		int sumTotl1 = 0;
		int sumBiz11 = 0;
		int sumBiz21 = 0;
		for(int i=0; i<list1.size(); i++) {
			TotalCode totalCodeList1 = list1.get(i);
			sumTotl1 += Integer.parseInt(totalCodeList1.getTOTL());
			sumBiz11 += Integer.parseInt(totalCodeList1.getBIZ1());
			sumBiz21 += Integer.parseInt(totalCodeList1.getBIZ2());
		}
		map.put("sumTotl1", sumTotl1);
		map.put("sumBiz11", sumBiz11);
		map.put("sumBiz21", sumBiz21);
		map.put("list1", list1);
		
		List<TotalCode> list2 = businessStateHyunhwangMapper.getBusinessState2BonbuHyunhwangInfo();
		int sumTotl2 = 0;
		int sumBiz12 = 0;
		int sumBiz22 = 0;
		for(int i=0; i<list2.size(); i++) {
			TotalCode totalCodeList2 = list2.get(i);
			sumTotl2 += Integer.parseInt(totalCodeList2.getTOTL());
			sumBiz12 += Integer.parseInt(totalCodeList2.getBIZ1());
			sumBiz22 += Integer.parseInt(totalCodeList2.getBIZ2());
		}
		map.put("sumTotl2", sumTotl2);
		map.put("sumBiz12", sumBiz12);
		map.put("sumBiz22", sumBiz22);
		map.put("list2", list2);
		
		List<TotalCode> list3 = businessStateHyunhwangMapper.getBusinessState3BonbuHyunhwangInfo();
		int sumTotl3 = 0;
		int sumBiz13 = 0;
		int sumBiz23 = 0;
		for(int i=0; i<list3.size(); i++) {
			TotalCode totalCodeList3 = list3.get(i);
			sumTotl3 += Integer.parseInt(totalCodeList3.getTOTL());
			sumBiz13 += Integer.parseInt(totalCodeList3.getBIZ1());
			sumBiz23 += Integer.parseInt(totalCodeList3.getBIZ2());
		}
		map.put("sumTotl3", sumTotl3);
		map.put("sumBiz13", sumBiz13);
		map.put("sumBiz23", sumBiz23);
		map.put("list3", list3);
		
		List<TotalCode> list4 = businessStateHyunhwangMapper.getBusinessState4BonbuHyunhwangInfo();
		int sumTotl4 = 0;
		int sumBiz14 = 0;
		int sumBiz24 = 0;
		for(int i=0; i<list4.size(); i++) {
			TotalCode totalCodeList4 = list4.get(i);
			sumTotl4 += Integer.parseInt(totalCodeList4.getTOTL());
			sumBiz14 += Integer.parseInt(totalCodeList4.getBIZ1());
			sumBiz24 += Integer.parseInt(totalCodeList4.getBIZ2());
		}
		map.put("sumTotl4", sumTotl4);
		map.put("sumBiz14", sumBiz14);
		map.put("sumBiz24", sumBiz24);
		map.put("list4", list4);
		
		List<TotalCode> list5 = businessStateHyunhwangMapper.getBusinessState5BonbuHyunhwangInfo();
		int sumTotl5 = 0;
		int sumBiz15 = 0;
		int sumBiz25 = 0;
		for(int i=0; i<list5.size(); i++) {
			TotalCode totalCodeList5 = list5.get(i);
			sumTotl5 += Integer.parseInt(totalCodeList5.getTOTL());
			sumBiz15 += Integer.parseInt(totalCodeList5.getBIZ1());
			sumBiz25 += Integer.parseInt(totalCodeList5.getBIZ2());
		}
		map.put("sumTotl5", sumTotl5);
		map.put("sumBiz15", sumBiz15);
		map.put("sumBiz25", sumBiz25);
		map.put("list5", list5);
		
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengList = businessStateHyunhwangMapper.getBusinessStateJinhaengHyunhwangInfo();
		map.put("jinhaengList", jinhaengList);
		return map;
	}

	public Map<String, Object> sujuGubunListProcess(TotalCode totalCode){
		Map<String, Object> map = new HashMap<String, Object>();
		if(totalCode.getSYS_COD().equals("설계1본부")){
			totalCode.setSYS_COD("7500");	
		} else if(totalCode.getSYS_COD().equals("설계2본부")){
			totalCode.setSYS_COD("7600");
		} else if(totalCode.getSYS_COD().equals("설계3본부")){
			totalCode.setSYS_COD("7700");
		} else if(totalCode.getSYS_COD().equals("설계4본부")){
			totalCode.setSYS_COD("7800");
		} else if(totalCode.getSYS_COD().equals("설계5본부")){
			totalCode.setSYS_COD("7900");
		}
		System.out.println("totalCode : " + totalCode);
		List<BusinessStateJinhaengHyunhwangDomain> sujuGubunList = businessStateHyunhwangMapper.getSujuGubunInfo(totalCode);
		System.out.println("sujuGubunList : " + sujuGubunList);
		map.put("sujuGubunList", sujuGubunList);
		return map;
	}

	public Map<String, Object> jinhaengSangtaeListProcess(BusinessStateJinhaengHyunhwangDomain businessStateJinhaengHyunhwangDomain){
		Map<String, Object> map = new HashMap<String, Object>();
		businessStateJinhaengHyunhwangDomain.setACT_STAT("1");//미승인
		List<BusinessStateJinhaengHyunhwangDomain> meSeunginSangtaeList = businessStateHyunhwangMapper.getJinhaengSangtaeInfo(businessStateJinhaengHyunhwangDomain);
		businessStateJinhaengHyunhwangDomain.setACT_STAT("2");//진행
		List<BusinessStateJinhaengHyunhwangDomain> jinhaengSangtaeList = businessStateHyunhwangMapper.getJinhaengSangtaeInfo(businessStateJinhaengHyunhwangDomain);
		//System.out.println("jinhaengSangtaeList : " + jinhaengSangtaeList);
		map.put("jinhaengSangtaeList", jinhaengSangtaeList);
		//System.out.println("meSeunginSangtaeList : " + meSeunginSangtaeList);
		map.put("meSeunginSangtaeList", meSeunginSangtaeList);
		return map;
	}
}
