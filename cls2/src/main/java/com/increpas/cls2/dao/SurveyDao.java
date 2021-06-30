package com.increpas.cls2.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class SurveyDao {
/**
 * 설문조사 관련 데이터베이스 작업을 전담할 클래스
 */
	@Autowired
	SqlSessionTemplate sqlSession;
	
	/*
	 * 현재 진행중인 설문조사 갯수 조회전담 처리함수
	 */
	public int getPcount() {
		return sqlSession.selectOne("sSQL.psntCount");
	}
	/*
	 * 진행중인 설문조사 리스트 조회 질의명령
	 */
	public List getList() {
		return sqlSession.selectList("sSQL.ingSrvy");
	}
}
