package com.Bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

	public static void main(String[] args) {

		//SpringApplication.run(BridgeApplication.class, args);

		Card card1 = new GiftCard(new Produce(), new Create());
		card1.createCard();
		Card card2 = new Bonus(new Produce(), new Create());
		card2.createCard();
		Card card3 = new Voucher(new Produce(), new Create());
		card3.createCard();
	}

}
