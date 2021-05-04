package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added succesfully : " + game.getGameName() + "\nGame Type : " + game.getGameType()
				+ "\nGame Price : " + game.getGamePrice() + " TL");
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted succesfully : " + game.getGameName());

	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated succesfully : " + game.getGameName());

	}

	



}
