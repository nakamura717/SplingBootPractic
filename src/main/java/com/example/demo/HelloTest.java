package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//①「私はコントローラーです」という目印
@Controller
public class HelloTest {
	// ②「http://localhost:8080/greeting」にアクセスしたときにこのメソッドを動かす
	@GetMapping("/HelloName")
	public String greeting(
			// ③ URLの「?name=〇〇」の部分を受け取る（デフォルトは「ゲスト」）
			@RequestParam(name = "name", required = false, defaultValue = "匿名") String name,Model model
			// ④ 画面にデータを渡すための「箱」
			) {
		// ⑤「name」という名前のポケットに、変数nameの中身を入れる
        model.addAttribute("name", name);
        
        // ⑥「hello.html」を表示しなさい、という指示
        return "HelloName";
	}
}
