package com.springboottransactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTransactionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
	}

}

//Postman entry in JSON format
//{
//		"order":
//		{
//		"totalQuantity": 3,
//		"totalPrice": 3000,
//		"shoppingCartId": 2121
//		},
//		"payment":
//		{
//		"type": "DEBIT",
//		"cardName": "Ajay Patil 123",
//		"cardNumber": "1234 1234 1234",
//		"expiryYear": 2025,
//		"expiryMonth": 2,
//		"cvc": 123
//		}
//
//		}
