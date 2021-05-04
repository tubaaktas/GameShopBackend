package ConcoleUI;



import java.util.Date;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserCheckManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user1= new User();//real user
		user1.setId(1);
		user1.setFirstName("Tuðba");
		user1.setLastName("Aktaþ");
		user1.setNationalityId("10487698294");
		user1.setDateOfBirth(new Date(2000,8,23));
		
		User user2=new User();//fake user
		user2.setId(2);
		user2.setFirstName("Tolgay");
		user2.setLastName("Uður");
		user2.setNationalityId("1452369874");
		user2.setDateOfBirth(new Date(2009,3,17));
		
		Game game1=new Game();
		game1.setId(1);
		game1.setGameType("Araba Yarýþý");
		game1.setGameName("Need For Speed (NFS)");
		game1.setGamePrice(80);
		
		Campaign camp1=new Campaign();
		camp1.setId(1);
		camp1.setCampaignName("9 Mayýs Anneler Günü Kampanyasý");
		camp1.setDiscount(10);
		camp1.setCampaignStartDate(new Date(2021,5,9));
		camp1.setCampaignEndDate(new Date(2021,5,12));
		
		
		UserManager userManager = new UserManager(new UserCheckManager());
		userManager.add(user1);
		System.out.println("----------------------------------------------------");

		userManager.add(user2);
		System.out.println("----------------------------------------------------");
		
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		System.out.println("----------------------------------------------------");

		CampaignManager campManager = new CampaignManager();
		campManager.add(camp1);
		System.out.println("----------------------------------------------------");

		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignBuy(game1, user1, camp1);
	}

}
