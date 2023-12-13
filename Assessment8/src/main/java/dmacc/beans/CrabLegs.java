package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Nov 30, 2023
 */
@Embeddable
public class CrabLegs {
	private int quantity;
	private String type;
	
	public CrabLegs() {
		super();
	}

	public CrabLegs(int quantity, String type) {
		super();
		this.quantity = quantity;
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CrabLegs [quantity=" + quantity + ", type=" + type + "]";
	}
}
