package com.xworkz.contactapp.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.contactapp.dto.ContactDTO;
import com.xworkz.contactapp.email.ContactEmail;

@Component
@RequestMapping
public class ContactController {

	private List<ContactDTO> list;
	
	public ContactController(List<ContactDTO> list) {
		this.list = list;
		System.out.println("Created ContactController...");
	}

	@RequestMapping("click")
	public String click(ContactDTO dto, ContactEmail email, Model model) {
		model.addAttribute("dto", dto);
		email.sendMail(dto);
		list.add(dto);
		return "ContactDetails";
	}
	
	//below are ways to return the list to jsp page
	/*
	 * @RequestMapping(value="view", method=RequestMethod.GET) public ModelAndView
	 * getData() { ModelAndView model=new ModelAndView("ContactsView");
	 * model.addObject("lists", list); return model; }
	 */
	
	@RequestMapping(value="view", method=RequestMethod.GET)
	public String getData(Model model) {
		model.addAttribute("lists", list);
		return "ContactsView";
	}
}
