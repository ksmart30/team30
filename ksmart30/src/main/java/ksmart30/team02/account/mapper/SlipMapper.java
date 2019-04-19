/* 8.1.전표입력
 * @file     SlipMapper.java
 * @brief    전표입력 MapperInterface
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.SlipDetailDomain;
import ksmart30.team02.account.domain.SlipHeaderDomain;


@Mapper
public interface SlipMapper {
	//8.1.전표입력.getSlipInfo메서드
	/* @param  SlipDetailDomain slipDetailDomain 
	 * @brief   getSlipInfo추상메서드 선언	   		 	  
	 * @return List<SlipDetailDomain>
	 */
	List<SlipDetailDomain> getSlipInfo(SlipDetailDomain slipDetailDomain);
	//8.1.전표입력.getSlipHeaderInfo메서드
		/* @param  SlipDetailDomain slipDetailDomain 
		 * @brief   getSlipInfo추상메서드 선언	   		 	  
		 * @return  SlipHeaderDomain
		 */
	SlipHeaderDomain getSlipHeaderInfo(SlipDetailDomain slipDetailDomain);
	//8.1.전표입력.getControlItemInfo메서드
		/* @param  SlipDetailDomain slipDetailDomain 
		 * @brief   getSlipInfo추상메서드 선언	   		 	  
		 * @return  SlipHeaderDomain
		 */
	SlipDetailDomain getControlItemInfo(SlipDetailDomain slipDetailDomain);
	//8.1.전표입력.getSlipNoInfo메서드
		/* @param  SlipHeaderDomain slipHeaderDomain 
		 * @brief   getSlipInfo추상메서드 선언	   		 	  
		 * @return  SlipHeaderDomain
		 */
	List<SlipHeaderDomain> getSlipNoInfo(SlipHeaderDomain slipHeaderDomain);
}
