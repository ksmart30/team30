/* 10.2.5.계정과목코드
 * @file     AccountCodeMapper.java
 * @brief    계정과목코드 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AccountCodeDomain;
import ksmart30.team00.baseinfo.domain.ControlItemCodeDomain;
import ksmart30.team00.baseinfo.domain.TotalCode;

@Mapper
public interface AccountCodeMapper {
	
	// 10.2.5.계정과목코드.계정과목리스트
	/* @brief  selectAccountCodeList추상메서드 선언
	 * @return  List<AccountCode>
	 */
	List<AccountCodeDomain> selectAccountCodeList();
	
	// 10.2.5.계정과목코드.관리항목조회
	/* @brief  selectControlItemCodeList추상메서드 선언
	 * @return  List<AccountCode>
	 */
	List<ControlItemCodeDomain> selectControlItemCodeList();
	
	// 10.2.5.계정과목코드.계정코드조회
	/* @brief  selectAccountCodeInfo추상메서드 선언
	 * @return  List<AccountCode>
	 */
	List<AccountCodeDomain> selectAccountCodeInfo(AccountCodeDomain accountCodeDomain);
	
	// 10.2.5.계정과목코드.자산코드조회
	/* @brief  selectAccountCodeList추상메서드 선언
	 * @return  List<AccountCode>
	 */	
	List<TotalCode> selectAssetCodeInfo();
	
	// 10.2.5.계정과목코드.비용유형조회
	/* @brief  selectCostTypeInfo추상메서드 선언
	 * @return  List<AccountCode>
	 */	
	List<TotalCode> selectCostTypeInfo();
}
