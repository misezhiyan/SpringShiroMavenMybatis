package com.peng.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peng.web.po.User;
import com.peng.web.service.UserService;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(User user, Model model) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUserName(), user.getPassword());
		try {
			subject.login(usernamePasswordToken);
			logger.info("======��½�ɹ�=======");
			return "success";
		} catch (Exception e) {
			logger.error("======��½�쳣=======");
			// model.addAttribute("msg", "�û��������������,��½ʧ��");
			e.printStackTrace();
			return "/index";
		}
	}
}