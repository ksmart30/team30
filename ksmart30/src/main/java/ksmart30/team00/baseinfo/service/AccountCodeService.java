/* 10.2.5.계정과목코드
 * @file      AccountCodeService.java
 * @brief    계정과목코드 서비스 계층
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.AccountCodeMapper;
import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;
import ksmart30.team00.baseinfo.domain.TotalCode;

@Service
public class AccountCodeService {
	@Autowired
	AccountCodeMapper accountCodeMapper;
	
	// 10.2.5.계정과목코드.계정과목코드리스트조회
	/* @brief  AccountCodeMapper내 selectAccountCodeList메서드 호출, 숫자값 문자값으로 전환중 	                
	 * @return  List<AccountCodeDomain> list
	 */
	public List<AccountCodeDomain> getAccountCodeList(){
		System.out.println("02 getAccountCodeList 단위테스트");
		List<AccountCodeDomain> list = accountCodeMapper.selectAccountCodeList();
		return list;
	}
	// 10.2.5.계정과목코드.관리항목조회
	/* @brief  AccountCodeMapper내 selectControlItemCodeList메서드 호출                
	 * @return  List<AccountCodeDomain> list
	 */
	public List<ControlItemCodeDomain> getControlItemCodeList(){	
		System.out.println("02 getControlItemCodeList 단위테스트");
		List<ControlItemCodeDomain> controlItemCodelist =  accountCodeMapper.selectControlItemCodeList();
		return controlItemCodelist;
	}
	
	// 10.2.5.계정과목코드.계정과목코드조회
		/* @brief  AccountCodeMapper내 selectAccountCodeList메서드 호출                
		 * @return  List<AccountCodeDomain> list
		 */
	public List<AccountCodeDomain> accountCodeSearchProcess(AccountCodeDomain accountCodeDomain){
		List<AccountCodeDomain> list = accountCodeMapper.selectAccountCodeInfo(accountCodeDomain);
		return list;
	}
	
	// 10.2.5.계정과목코드.자산코드조회
	/* @brief  AccountCodeMapper내 selectAssetCodeInfo메서드 호출                
	 * @return  List<TotalCode> list
	 */
	public List<TotalCode> assetCodeSearchProcess(){
		List<TotalCode> list = accountCodeMapper.selectAssetCodeInfo();
		return list;
	}
	
	// 10.2.5.계정과목코드.비용유형조회
	/* @brief  AccountCodeMapper내 selectAssetCodeInfo메서드 호출                
	 * @return  List<TotalCode> list
	 */
	public List<TotalCode> costTypeSearchProcess(){
		List<TotalCode> list = accountCodeMapper.selectCostTypeInfo();
		return list;
	}
}
