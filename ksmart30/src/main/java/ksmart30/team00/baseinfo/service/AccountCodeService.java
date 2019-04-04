package ksmart30.team00.baseinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team00.baseinfo.mapper.AccountCodeMapper;
import ksmart30.team00.baseinfo.domain.AccountCode;

@Service
public class AccountCodeService {
	@Autowired
	AccountCodeMapper accountcodemapper;
	//AccountCodeMapper내 selectAccountCodeList메서드 호출, 숫자값 문자값으려 변환 후 리턴.
	public List<AccountCode> getAccountCodeList(){
		System.out.println("list테스트 getAccountCodeList AccountCodeService.java");
		List<AccountCode> list = accountcodemapper.selectAccountCodeList();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccClas() == "1") {
				list.get(i).setAccClas("자산");
			}
			
		}
		return list;
	}
	
}
