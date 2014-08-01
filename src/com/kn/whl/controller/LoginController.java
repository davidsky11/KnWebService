/**
 * 2010-1-25
 */
package com.kn.whl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kn.whl.entity.Account;
import com.kn.whl.service.AccountService;

/**
 * 登录控制器
 * 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a>
 * @version 1.0
 * @since 1.0
 */
@Controller
@RequestMapping(value = "/login.do")
public class LoginController {

	@Autowired
	private AccountService accountService;

	/**
	 * 初始化表单
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model) {
		Account account = new Account();
		model.addAttribute("account", account);
		// 直接跳转到登录页面
		return "account/login";
	}

	/**
	 * 登录
	 * 
	 * @param account
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String login(@ModelAttribute("account") Account account) {
		Account acc = accountService.read(account.getUsername(), account
				.getPassword());
		if (acc != null) {
			return "redirect:profile.do?id=" + acc.getId();
		} else {
			return "redirect:login.do";
		}
	}
}
