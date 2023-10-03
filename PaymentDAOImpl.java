package com.example.project.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import com.example.project.vo.PaymentVO;

@Repository
public class PaymentDAOImpl implements PaymentDAO {
	
	@Inject //주입
	private SqlSession sqlSession;

	@Override
	public boolean paymentCheck(PaymentVO vo) {
		String name = sqlSession.selectOne("payment.paymentCheck", vo);
		return (name==null) ? false : true;
	}
//	@Override
//	public MemberVO viewMember(MemberVO vo) {
//		return sqlSession.selectOne("login.viewMember", vo);
//	}	

}
