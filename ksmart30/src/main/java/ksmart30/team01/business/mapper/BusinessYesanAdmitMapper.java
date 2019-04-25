package ksmart30.team01.business.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessYesanAdmitMapper {
	List<Map<String,String>> getDeptList();

	List<Map<String, String>> getProjectList(Map<String, Object> searchMap);

	List<Map<String, String>> getResultProjectList(Map<String, Object> searchMap);

	List<Map<String, String>> getResultEmpList(Map<String, Object> searchMap);

	Map<String, Object> getResultProject(String PJT_CD);
}
