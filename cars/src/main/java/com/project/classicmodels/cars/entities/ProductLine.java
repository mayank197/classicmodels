package com.project.classicmodels.cars.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the productlines database table.
 * 
 */
@Entity
@Table(name="productlines")
@NamedQuery(name="ProductLine.findAll", query="SELECT p FROM ProductLine p")
public class ProductLine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_line")
	private String productLine;

	@Column(name="html_description")
	private String htmlDescription;

	@Lob
	private Byte[] image;

	@Column(name="text_description")
	private String textDescription;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="productLine")
	private Set<Product> products;

	public ProductLine() {
	}

	public String getProductLine() {
		return this.productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getHtmlDescription() {
		return this.htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public Byte[] getImage() {
		return this.image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public String getTextDescription() {
		return this.textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProductline(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setProductline(null);

		return product;
	}

}