package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AccountCode;

@Mapper
public interface AccountCodeMapper {
	//selectAccountCodeList추상메서드 선언
	public List<AccountCode> selectAccountCodeList();
}
