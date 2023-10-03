package com.example.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.service.PaymentService;

import com.example.project.vo.PaymentVO;

@Controller
public class PaymentController {
	
	@Inject
	private PaymentService paymentService;
	
	@RequestMapping("/payment/payment")
	public String payment() {
		return "/payment/payment";
	}
	
	
	@RequestMapping("/payment/paymentCheck")
	public ModelAndView paymentCheck(@ModelAttribute PaymentVO vo,HttpSession session) {
		boolean result = paymentService.paymentCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result ==true) {
			mav.addObject("msg","결제성공");
			mav.setViewName("/payment/paid");
		}else {
			mav.addObject("msg","결제실패");
			mav.setViewName("/payment/payment");
		}
		return mav;
	}

}
