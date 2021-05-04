package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added succesfully : " + campaign.getCampaignName() + "\nCampaign discount : "
				+ campaign.getDiscount() + "\nCampaign start date : " + campaign.getCampaignStartDate()
				+ "\nCampaign end date : " + campaign.getCampaignEndDate() + "\nCampaign duration :  "
				+ campaign.getCampaignDay(campaign) + " day");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("End of day " + campaign.getCampaignDay(campaign) + " !!!" + " Campaign deleted : "
				+ campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampaignName());

	}

}
