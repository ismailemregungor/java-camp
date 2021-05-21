package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getId() + " id'li kampanya eklendi");

	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println(campaign.getId() + " id'li kampanya gŁncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getId()  + " id'li kampanya silindi");
		
	}

}
