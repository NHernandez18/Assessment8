package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Nov 25, 2023
 */
@Entity
public class LobsterTail {
	@Id
	@GeneratedValue
	private long id;
	private String weight;
	private double price;
	private String flavor;
	@Autowired
	private CrabLegs CrabLegs;
	
	public LobsterTail() {
		super();
		this.flavor = "Garlic Parmesan, medium spicy";
	}

	public LobsterTail(String weight) {
		super();
		this.weight = weight;
	}

	public LobsterTail(String weight, double price, String flavor) {
		super();
		this.weight = weight;
		this.price = price;
		this.flavor = flavor;
	}

	public LobsterTail(long id, String weight, double price, String flavor) {
		super();
		this.id = id;
		this.weight = weight;
		this.price = price;
		this.flavor = flavor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public CrabLegs getCrabLegs() {
		return CrabLegs;
	}

	public void setCrabLegs(CrabLegs crabLegs) {
		CrabLegs = crabLegs;
	}

	@Override
	public String toString() {
		return "LobsterTail [id=" + id + ", weight=" + weight + ", price=" + price + ", flavor=" + flavor
				+ ", CrabLegs=" + CrabLegs + "]";
	}
}