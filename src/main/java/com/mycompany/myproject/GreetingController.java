/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name",required = false, defaultValue = "World") String name,Model model) {
		model.addAttribute("name", name);
                return "greeting";
	}
        @GetMapping
        public String main(Model model){
            model.addAttribute("some","hello lets code");
            return "main";
        }
}
