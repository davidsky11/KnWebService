/**
 * 2010-1-23
 */
package com.kn.whl.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kn.whl.service.AccountService;

/**
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Controller
@RequestMapping("/account.do")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.GET)
	public Map register(@RequestParam("username") String u,
			@RequestParam("password") String p, ModelMap model) {

		System.out.println(accountService.read(u, p));

		model.put("msg", u);
		return model;
	}

}
