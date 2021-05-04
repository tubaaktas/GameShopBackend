package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	public void buy(Game game, User user);
	
	public void campaignBuy(Game game, User user,Campaign campaign);

}
