package com.increpas.cls2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.increpas.cls2.dao.SurveyDao;

@Controller
@RequestMapping("/survey")
public class Survey {
	@Autowired
	SurveyDao sDao;
	@Autowired
	//SurveyService sSrvc;
	/*
	 * 진행중인 설문 리스트 요청 처리함수
	 */
	@RequestMapping("/surveyList.cls")
	public ModelAndView SurveyList(ModelAndView mv) {
		//데이터베이스 조회
		List list = sDao.getList();
		//데이터 전달하고
		mv.addObject("LIST", list);
		//뷰 설정
		mv.setViewName("survey/surveyList");
		return mv;
	}

}
