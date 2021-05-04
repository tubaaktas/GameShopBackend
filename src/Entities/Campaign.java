package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private Date campaignStartDate;
	private Date campaignEndDate;
	private double discount;

	public Campaign(int id, String campaignName, Date campaignStartDate, Date campaignEndDate, double discount,
			long campaignDay) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
		this.discount = discount;

	}

	public Campaign() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getCampaignStartDate() {
		return campaignStartDate;
	}

	public void setCampaignStartDate(Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public Date getCampaignEndDate() {

		return campaignEndDate;
	}

	public void setCampaignEndDate(Date campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public long getCampaignDay(Campaign campaign) {
		int campaignDay = 0;
	    long diff = campaign.getCampaignEndDate().getTime() - campaign.getCampaignStartDate().getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000) ;
	    campaignDay = (int) diffDays;
	    return campaignDay;	
	}

	public void setCampaignDay(long campaignDay) {
	}

}
