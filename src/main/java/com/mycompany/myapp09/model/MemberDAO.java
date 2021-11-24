package com.mycompany.myapp09.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("MemberDao")
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public int idCheck(String id) throws Exception {
		return sqlSession.selectOne("MemberMapper.idCheck", id);
	}
}
