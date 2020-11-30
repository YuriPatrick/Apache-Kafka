package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {

    private final String orderId, email;
    private final BigDecimal amount;

    public Order(String email, String orderId, BigDecimal amount) {
    	this.email = email;
        this.orderId = orderId;
        this.amount = amount;
    }
    
	public String getEmail() {
		return email;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", email=" + email + ", amount=" + amount + "]";
	}
}
