package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		if( user.getDateOfBirth().getYear() <=2005 && user.getNationalityId().length() == 11) {
			System.out.println("Validation successful");
			return true;
		}else {
			System.out.println("Sorry "+ user.getFirstName()+" "+user.getLastName()+", "+"Credential missing or under 16 ! ");
			return false;
		}
	}

}
