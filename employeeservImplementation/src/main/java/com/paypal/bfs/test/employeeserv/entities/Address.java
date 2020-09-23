package com.paypal.bfs.test.employeeserv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "line1")
	@NotBlank(message = "Please enter line 1")
	@Valid
	private String line1;

	@Column(name = "line2")
	@Valid
	private String line2;

	@Column(name = "city")
	@NotBlank(message = "Please enter line 2")
	@Valid
	private String city;

	@Column(name = "state")
	@NotBlank(message = "Please enter the state")
	@Valid
	private String state;
	
	@Column(name = "country")
	@NotBlank(message = "Please enter the country")
	@Valid
	private String country;

	@Column(name = "zip_code")
	@NotBlank(message = "Please enter the zip code")
	@Valid
	private String zipCode;

	public Address() {
		super();
	}

	public Address(int id, @NotNull(message = "Please enter line 1") String line1, String line2,
			@NotNull(message = "Please enter the city") String city,
			@NotNull(message = "Please enter the state") String state,
			@NotNull(message = "Please enter the country") String country,
			@NotNull(message = "Please enter zip code") String zipCode) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the line1
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * @param line1 the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * @return the line2
	 */
	public String getLine2() {
		return line2;
	}

	/**
	 * @param line2 the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.state = country;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}