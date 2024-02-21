package com.example.aop;

import com.example.aop.aspect.CommonPointCut;
import com.example.aop.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopApplicationTests {
	@Autowired
	PaymentService paymentService;

	@Autowired
	CommonPointCut commonPointCut;

	@Test
	public void getData(){
//		commonPointCut.forLogPurpose();
		paymentService.makePayment();
	}
}