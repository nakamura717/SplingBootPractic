package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LikeController {
	@PostMapping("/like")
	public String like(
			@RequestParam(name = "food")String food,
			@RequestParam(name = "reason")String reason,Model model 
				
			) {
		model.addAttribute("food", food);
		model.addAttribute("reason", reason);
		
		return "like";
		
	}
}
