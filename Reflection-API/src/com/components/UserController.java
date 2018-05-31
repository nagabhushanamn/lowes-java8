package com.components;

import com.container.RequestMapping;

public class UserController {

	@RequestMapping(url = "/register", method = "POST")
	public void doLogin() {
		// ...
		System.out.println("doLogin()..");
	}

	@RequestMapping(url = "/login", method = "POST")
	public void doRegister() {
		// ..
		System.out.println("doRegister()..");
	}

}
