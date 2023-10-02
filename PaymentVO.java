package com.project.payment.vo;

import java.sql.Date;

public class PaymentVO {
	// 테이블의 컬럼이름, 폼태그의 name
	private String name;
	private String phone;
	private String card_num;
	private String card_pw;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

	public String getCard_pw() {
		return card_pw;
	}

	public void setCard_pw(String card_pw) {
		this.card_pw = card_pw;
	}

	@Override
	public String toString() {
		return "PaymentVO [name=" + name + ", phone=" + phone + ", card_num=" + card_num + ", card_pw=" + card_pw + "]";
	}

}
