package com.quakd.web.model;

// Generated Jan 6, 2014 8:21:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Store;

/**
 * CompanyInformation generated by hbm2java
 */
@Entity
@Table(name = "company_information", catalog = "quser")
@Indexed
public class CompanyInformation implements java.io.Serializable {

	private Long companyCd;
	private String companyName;
	private Date foundedDt;
	private String contactNo;
	private byte[] companyLogo;
	private String companyLogoType;	
	private String facebook;
	private String twitter;
	private String website;
	private String description;
	private Set<CompanyLocation> companyLocations = new HashSet<CompanyLocation>(
			0);
	private Set<CompanyQponds> companyQpondses = new HashSet<CompanyQponds>(0);	
	private Set<CompanyBilling> companyBillings = new HashSet<CompanyBilling>(0);
	private Set<MemberRoles> memberRoleses = new HashSet<MemberRoles>(0);
	private Set<CompanyMessage> companyMessages = new HashSet<CompanyMessage>(0);

	public CompanyInformation() {
	}

	public CompanyInformation(String companyName, String contactNo) {
		this.companyName = companyName;
		this.contactNo = contactNo;
	}

	public CompanyInformation(String companyName, Date foundedDt,
			String contactNo, byte[] companyLogo, String companyLogoType,
			String facebook, String twitter, String website,
			String description, Set<CompanyLocation> companyLocations,
			Set<CompanyQponds> companyQpondses,
			Set<CompanyMessage> companyMessages,
			Set<CompanyBilling> companyBillings, Set<MemberRoles> memberRoleses) {
		this.companyName = companyName;
		this.foundedDt = foundedDt;
		this.contactNo = contactNo;
		this.companyLogo = companyLogo;
		this.companyLogoType = companyLogoType;
		this.facebook = facebook;
		this.twitter = twitter;
		this.website = website;
		this.description = description;
		this.companyLocations = companyLocations;
		this.companyQpondses = companyQpondses;
		this.companyMessages = companyMessages;
		this.companyBillings = companyBillings;
		this.memberRoleses = memberRoleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "COMPANY_CD", unique = true, nullable = false)
	public Long getCompanyCd() {
		return this.companyCd;
	}

	public void setCompanyCd(Long companyCd) {
		this.companyCd = companyCd;
	}

	@Column(name = "COMPANY_NAME", nullable = false, length = 200)
	@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)	
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FOUNDED_DT", length = 10)
	public Date getFoundedDt() {
		return this.foundedDt;
	}

	public void setFoundedDt(Date foundedDt) {
		this.foundedDt = foundedDt;
	}

	@Column(name = "CONTACT_NO", nullable = false, length = 10)
	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Column(name = "COMPANY_LOGO")
	public byte[] getCompanyLogo() {
		return this.companyLogo;
	}

	public void setCompanyLogo(byte[] companyLogo) {
		this.companyLogo = companyLogo;
	}

	@Column(name = "FACEBOOK", length = 1000)
	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "TWITTER", length = 1000)
	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "WEBSITE", length = 1000)
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyInformation", cascade = CascadeType.ALL)
	public Set<CompanyLocation> getCompanyLocations() {
		return this.companyLocations;
	}

	public void setCompanyLocations(Set<CompanyLocation> companyLocations) {
		this.companyLocations = companyLocations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyInformation", cascade = CascadeType.ALL)
	public Set<CompanyBilling> getCompanyBillings() {
		return this.companyBillings;
	}

	public void setCompanyBillings(Set<CompanyBilling> companyBillings) {
		this.companyBillings = companyBillings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyInformation", cascade = CascadeType.ALL)
	public Set<MemberRoles> getMemberRoleses() {
		return this.memberRoleses;
	}

	public void setMemberRoleses(Set<MemberRoles> memberRoleses) {
		this.memberRoleses = memberRoleses;
	}
	
	@Column(name = "COMPANY_LOGO_TYPE", length = 100)
	public String getCompanyLogoType() {
		return this.companyLogoType;
	}

	public void setCompanyLogoType(String companyLogoType) {
		this.companyLogoType = companyLogoType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyInformation")
	public Set<CompanyQponds> getCompanyQpondses() {
		return this.companyQpondses;
	}

	public void setCompanyQpondses(Set<CompanyQponds> companyQpondses) {
		this.companyQpondses = companyQpondses;
	}
	
	@Column(name = "DESCRIPTION", length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companyInformation")
	public Set<CompanyMessage> getCompanyMessages() {
		return this.companyMessages;
	}

	public void setCompanyMessages(Set<CompanyMessage> companyMessages) {
		this.companyMessages = companyMessages;
	}
}
