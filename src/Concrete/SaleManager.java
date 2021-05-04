package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void buy(Game game, User user) {
		System.out.println("Game added to basket : " + game.getGameName() + "\nUser receiving the game : "
				+ user.getFirstName() + " " + user.getLastName() + "\nTotal Price : " + game.getGamePrice());
	}

	@Override
	public void campaignBuy(Game game, User user, Campaign campaign) {
		double campaignPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscount() / 100);
	
		System.out.println("\nGame added to basket: " + game.getGameName() + "\nGame Type : " + game.getGameType()
				+ "\nCampaign Type : " + campaign.getCampaignName() +"\nGame Price : "+game.getGamePrice()+ "\nDiscounted Price : " + campaignPrice + "TL"
				+ "\nPurchasing User : " + user.getFirstName() + " " + user.getLastName());

	}

}
