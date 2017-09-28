package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanPlanner;

public class DonTest {

	public static void main(String[] args) throws Exception {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/don/common/application-context.xml"));
		LoanPlanner loanPlanner = factory.getBean("loanPlanner", LoanPlanner.class);
		double interestAmount = loanPlanner.calculate(100000, 12, "hyderabad");
		System.out.println("Interest Amout paid for place: "+interestAmount);
	}

}
