package com.example.incometax.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deduction")
public class DeductionEntity {

	@Id
	@Column(name = "deductionId")
	private int deductionId;

	

	@Column(name = "Life_Insurance")
	private double lip;

	@Column(name = "Unit_Linked_Insurance")
	private double ulip;

	@Column(name = "Public_Provident_Found")
	private double ppf;

	@Column(name = "National_Savings_Certificate")
	private double nsc;

	@Column(name = "tutionFee")
	private double tutionfee;

	@Column(name = "FD")
	private double fd;

	@Column(name = "Sukanaya_Samriddhi_Scheme")
	private double sss;

	@Column(name = "houseLoan")
	private double houseloan;

	public int getDeductionId() {
		return deductionId;
	}

	public void setDeductionId(int deductionId) {
		this.deductionId = deductionId;
	}


	public double getLip() {
		return lip;
	}

	public void setLip(double lip) {
		this.lip = lip;
	}

	public double getUlip() {
		return ulip;
	}

	public void setUlip(double ulip) {
		this.ulip = ulip;
	}

	public double getPpf() {
		return ppf;
	}

	public void setPpf(double ppf) {
		this.ppf = ppf;
	}

	public double getNsc() {
		return nsc;
	}

	public void setNsc(double nsc) {
		this.nsc = nsc;
	}

	public double getTutionfee() {
		return tutionfee;
	}

	public void setTutionfee(double tutionfee) {
		this.tutionfee = tutionfee;
	}

	public double getFd() {
		return fd;
	}

	public void setFd(double fd) {
		this.fd = fd;
	}

	public double getSss() {
		return sss;
	}

	public void setSss(double sss) {
		this.sss = sss;
	}

	public double getHouseloan() {
		return houseloan;
	}

	public void setHouseloan(double houseloan) {
		this.houseloan = houseloan;
	}

	}