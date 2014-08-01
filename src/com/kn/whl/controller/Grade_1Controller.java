/**
 * 一级站点控制层
 */
package com.kn.whl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kn.whl.service.Grade_1Service;

/**
 * @author hp
 *
 */
@Controller
@RequestMapping("/grade_1.do")
public class Grade_1Controller {
	@Autowired
	private Grade_1Service grade_1Service;
}
