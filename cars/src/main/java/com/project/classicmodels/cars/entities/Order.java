package com.project.classicmodels.cars.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cof_oms_attachment_id")
	private int cofOmsAttachmentId;

	@Lob
	private String comments;

	@Column(name="created_by")
	private int createdBy;

	@Column(name="created_time")
	private Timestamp createdTime;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="effective_date")
	private Timestamp effectiveDate;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="engagement_to_opportunity_id")
	private int engagementToOpportunityId;

	@Column(name="is_demo")
	private byte isDemo;

	@Column(name="is_order_to_cash_enabled")
	private byte isOrderToCashEnabled;

	@Column(name="order_code")
	private String orderCode;

	@Column(name="order_version")
	private int orderVersion;

	@Temporal(TemporalType.DATE)
	private Date orderDate;

	private int orderNumber;

	@Column(name="quote_created_by")
	private int quoteCreatedBy;

	@Column(name="quote_id")
	private int quoteId;

	@Column(name="quote_version")
	private int quoteVersion;

	@Temporal(TemporalType.DATE)
	private Date requiredDate;

	@Temporal(TemporalType.DATE)
	private Date shippedDate;

	private String stage;

	@Column(name="start_date")
	private Timestamp startDate;

	private String status;

	@Column(name="term_in_months")
	private int termInMonths;

	//bi-directional many-to-one association to Orderdetail
	@OneToMany(mappedBy="order")
	private Set<Orderdetail> orderdetails;

	//bi-directional many-to-one association to Customer
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customerNumber")
	private Customer customer;

	public Order() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCofOmsAttachmentId() {
		return this.cofOmsAttachmentId;
	}

	public void setCofOmsAttachmentId(int cofOmsAttachmentId) {
		this.cofOmsAttachmentId = cofOmsAttachmentId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Timestamp getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getEngagementToOpportunityId() {
		return this.engagementToOpportunityId;
	}

	public void setEngagementToOpportunityId(int engagementToOpportunityId) {
		this.engagementToOpportunityId = engagementToOpportunityId;
	}

	public byte getIsDemo() {
		return this.isDemo;
	}

	public void setIsDemo(byte isDemo) {
		this.isDemo = isDemo;
	}

	public byte getIsOrderToCashEnabled() {
		return this.isOrderToCashEnabled;
	}

	public void setIsOrderToCashEnabled(byte isOrderToCashEnabled) {
		this.isOrderToCashEnabled = isOrderToCashEnabled;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public int getOrderVersion() {
		return this.orderVersion;
	}

	public void setOrderVersion(int orderVersion) {
		this.orderVersion = orderVersion;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getQuoteCreatedBy() {
		return this.quoteCreatedBy;
	}

	public void setQuoteCreatedBy(int quoteCreatedBy) {
		this.quoteCreatedBy = quoteCreatedBy;
	}

	public int getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public int getQuoteVersion() {
		return this.quoteVersion;
	}

	public void setQuoteVersion(int quoteVersion) {
		this.quoteVersion = quoteVersion;
	}

	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTermInMonths() {
		return this.termInMonths;
	}

	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Orderdetail addOrderdetail(Orderdetail orderdetail) {
		getOrderdetails().add(orderdetail);
		orderdetail.setOrder(this);

		return orderdetail;
	}

	public Orderdetail removeOrderdetail(Orderdetail orderdetail) {
		getOrderdetails().remove(orderdetail);
		orderdetail.setOrder(null);

		return orderdetail;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}