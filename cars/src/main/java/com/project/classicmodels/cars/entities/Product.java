package com.project.classicmodels.cars.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String productId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date addDate;

	private BigDecimal buyPrice;

	private String category;

	private String description;

	private Integer id;

	@Lob
	private Byte[] image;

	private String model;

	private BigDecimal msrp;

	private String name;

	private BigDecimal price;

	private String productCode;

	@Lob
	private String productDescription;

	private String productScale;

	private String productVendor;

	private Integer quantity;

	private short quantityInStock;

	//bi-directional many-to-one association to OrderDetail
	@OneToMany(mappedBy="product")
	private Set<OrderDetail> orderDetails;

	//bi-directional many-to-one association to ProductLine
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="productLine")
	private ProductLine productLine;

	public Product() {
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Date getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public BigDecimal getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte[] getImage() {
		return this.image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getMsrp() {
		return this.msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductScale() {
		return this.productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return this.productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public short getQuantityInStock() {
		return this.quantityInStock;
	}

	public void setQuantityInStock(short quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public OrderDetail addOrderdetail(OrderDetail orderdetail) {
		getOrderDetails().add(orderdetail);
		orderdetail.setProduct(this);

		return orderdetail;
	}

	public OrderDetail removeOrderdetail(OrderDetail orderdetail) {
		getOrderDetails().remove(orderdetail);
		orderdetail.setProduct(null);

		return orderdetail;
	}

	public ProductLine getProductline() {
		return this.productLine;
	}

	public void setProductline(ProductLine productline) {
		this.productLine = productline;
	}

}