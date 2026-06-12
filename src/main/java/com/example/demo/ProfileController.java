package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {
	@GetMapping("/profile")
	public String profile(
			//defaultValueは文字列のみ受け取るb
				@RequestParam(name = "age", required = false, defaultValue = "20")String age, Model model
			) {
		model.addAttribute("age", age);
		//ここには送るhtmlファイルなどを書く
		return "profile";
	}

}
