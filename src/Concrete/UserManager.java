package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	UserCheckService check;

	public UserManager(UserCheckService check) {
		super();
		this.check = check;
	}

	@Override
	public void add(User user) {
		if (check.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() +" "+ user.getLastName() + ", " + " profile  added succesfully. ");
		} else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void delete(User user) {
		if (check.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() + user.getLastName() + ", " + " profile deleted succesfully. ");
		} else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(User user) {
		if (check.checkIfRealPerson(user) == true) {
			System.out.println(user.getFirstName() + user.getLastName() + " " + " profile updated succesfully. ");
		} else {
			System.out.println("Not a valid person");
		}
	}

}
