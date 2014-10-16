package com.quakd.web.model;

// Generated Jan 24, 2014 11:54:24 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MemberFavorites generated by hbm2java
 */
@Entity
@Table(name = "member_favorites", catalog = "quser")
public class MemberFavorites implements java.io.Serializable {

	private Long favid;
	private Member member;
	private CompanyLocation companyLocation;

	public MemberFavorites() {
	}

	public MemberFavorites(Member member, CompanyLocation companyLocation) {
		this.member = member;
		this.companyLocation = companyLocation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "favid", unique = true, nullable = false)
	public Long getFavid() {
		return this.favid;
	}

	public void setFavid(Long favid) {
		this.favid = favid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loc_id", nullable = false)
	public CompanyLocation getCompanyLocation() {
		return this.companyLocation;
	}

	public void setCompanyLocation(CompanyLocation companyLocation) {
		this.companyLocation = companyLocation;
	}

}