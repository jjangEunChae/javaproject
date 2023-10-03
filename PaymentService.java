package com.example.project.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.example.project.vo.PaymentVO;

@Service
public class PaymentService {

	public boolean paymentCheck(PaymentVO vo, HttpSession session) {
		return false;
	}

}
