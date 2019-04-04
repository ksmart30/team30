package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.AssetClassifyCodeMapper;
import ksmart30.team00.baseinfo.domain.AssetClassifyCode;

@Service
public class AssetClassifyCodeService {
@Autowired
AssetClassifyCodeMapper assetClassifyCodeMapper;
	//AssetClassifyCodeMapper내 assetClassifyCodeList메서드 호출, 리턴값 AssetClassfyCodeController로 리턴.
	public List<AssetClassifyCode> assetClassifyCodeList(){
		System.out.println("02 단위테스트");
		List<AssetClassifyCode> assetClassifyCode = assetClassifyCodeMapper.assetClassifyCodeList();
		System.out.println("assetClassifyCode : " + assetClassifyCode);
		return assetClassifyCode;
	}
}
