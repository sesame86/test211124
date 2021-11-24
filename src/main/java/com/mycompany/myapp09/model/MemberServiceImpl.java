package com.mycompany.myapp09.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MemberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public int idCheck(String id) throws Exception {
		return memberDAO.idCheck(id);
	}
}
