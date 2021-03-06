package com.kh.spring.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring.menu.model.service.MenuService;
import com.kh.spring.menu.model.vo.Menu;
import com.kh.spring.menu.model.vo.MenuType;

import lombok.extern.slf4j.Slf4j;

/**
 * @RestController = @Controller + @ResponseBody
 * 모든 handler는 @ResponseBody로 처리된다.
 *
 */
@RestController
@Slf4j
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@GetMapping("/menus")
	public List<Menu> menus(){
		//1. 업무로직
		List<Menu> list = menuService.selectMenuList();
		log.debug("list = {}", list);
		//2. 리턴하면 @ResponseBody에 의해서 json변환후, 응답출력 처리
		
		return list;
	}
}




