package com.quakd.web.model;

// Generated Jan 25, 2014 1:20:57 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MemberQidRedeem generated by hbm2java
 */
@Entity
@Table(name = "member_qid_redeem", catalog = "quser")
public class MemberQidRedeem implements java.io.Serializable {

	private Long rdid;
	private Member member;
	private MemberQuaks memberQuaks;
	private CompanyQponds companyQponds;
	private String cdUsed;
	private Date cdUsedDt;

	public MemberQidRedeem() {
	}

	public MemberQidRedeem(Member member, MemberQuaks memberQuaks,
			CompanyQponds companyQponds, String cdUsed) {
		this.member = member;
		this.memberQuaks = memberQuaks;
		this.companyQponds = companyQponds;
		this.cdUsed = cdUsed;
	}

	public MemberQidRedeem(Member member, MemberQuaks memberQuaks,
			CompanyQponds companyQponds, String cdUsed, Date cdUsedDt) {
		this.member = member;
		this.memberQuaks = memberQuaks;
		this.companyQponds = companyQponds;
		this.cdUsed = cdUsed;
		this.cdUsedDt = cdUsedDt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rdid", unique = true, nullable = false)
	public Long getRdid() {
		return this.rdid;
	}

	public void setRdid(Long rdid) {
		this.rdid = rdid;
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
	@JoinColumn(name = "quakid", nullable = false)
	public MemberQuaks getMemberQuaks() {
		return this.memberQuaks;
	}

	public void setMemberQuaks(MemberQuaks memberQuaks) {
		this.memberQuaks = memberQuaks;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "qid", nullable = false)
	public CompanyQponds getCompanyQponds() {
		return this.companyQponds;
	}

	public void setCompanyQponds(CompanyQponds companyQponds) {
		this.companyQponds = companyQponds;
	}

	@Column(name = "cd_used", nullable = false, length = 1)
	public String getCdUsed() {
		return this.cdUsed;
	}

	public void setCdUsed(String cdUsed) {
		this.cdUsed = cdUsed;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cd_used_dt", length = 19)
	public Date getCdUsedDt() {
		return this.cdUsedDt;
	}

	public void setCdUsedDt(Date cdUsedDt) {
		this.cdUsedDt = cdUsedDt;
	}

}
