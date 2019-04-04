package ksmart30.team02.account.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart30.team02.account.domain.Slip;

@Mapper
public interface SlipMapper {
	//SlipList추사메서드 선언
	List<Slip> SlipList();
}
