package ksmart30.team00.baseinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team00.baseinfo.domain.AssetClassifyCode;

@Mapper
public interface AssetClassifyCodeMapper {
	//assetClassifyCodeList추상메서드 선언
	List<AssetClassifyCode> assetClassifyCodeList();
}
