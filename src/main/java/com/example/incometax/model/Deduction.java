package com.example.incometax.model;

public class Deduction{
	private int deductionId;

	private double LIP;
	private double ULIP;
	private double PPF;
	private double NSC;
	private double TutionFee;
	private double Fd;
	private double SSS;
	private double HouseLoan;
	public int getDeductionId() {
		return deductionId;
	}
	public void setDeductionId(int deductionId) {
		this.deductionId = deductionId;
	}

	public double getLIP() {
		return LIP;
	}
	public void setLIP(double lIP) {
		LIP = lIP;
	}
	public double getULIP() {
		return ULIP;
	}
	public void setULIP(double uLIP) {
		ULIP = uLIP;
	}
	public double getPPF() {
		return PPF;
	}
	public void setPPF(double pPF) {
		PPF = pPF;
	}
	public double getNSC() {
		return NSC;
	}
	public void setNSC(double nSC) {
		NSC = nSC;
	}
	public double getTutionFee() {
		return TutionFee;
	}
	public void setTutionFee(double tutionFee) {
		TutionFee = tutionFee;
	}
	public double getFd() {
		return Fd;
	}
	public void setFd(double fd) {
		Fd = fd;
	}
	public double getSSS() {
		return SSS;
	}
	public void setSSS(double sSS) {
		SSS = sSS;
	}
	public double getHouseLoan() {
		return HouseLoan;
	}
	public void setHouseLoan(double houseLoan) {
		HouseLoan = houseLoan;
	}
}