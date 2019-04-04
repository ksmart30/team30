package ksmart30.team02.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart30.team02.account.domain.Slip;
import ksmart30.team02.account.mapper.SlipMapper;

@Service
public class SlipService {
@Autowired
SlipMapper slipMapper;
	//SlipMapper내 SlipList메서드 호출, 리턴값 SlipController로 리턴.
	public List<Slip> slipList(){
		System.out.println("02 단위테스트");
		List<Slip> slip = slipMapper.SlipList();
		System.out.println("slip : " + slip);
		return slip;
	}


}
