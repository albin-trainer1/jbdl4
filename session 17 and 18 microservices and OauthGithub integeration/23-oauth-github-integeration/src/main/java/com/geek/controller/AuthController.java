package com.geek.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;
import org.springframework.boot.info.GitProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.context.SecurityContextHolder;
@RestController
public class AuthController {
	@GetMapping
	public String test() {
		return "TEST";
	}
	
//	@GetMapping("/hello") 
//	public  Map<String, Object> home (@AuthenticationPrincipal OAuth2User principal) {
//	//	System.out.println(p);
//		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//	        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
//	        System.out.println(oAuth2User.getAttributes());
//	      Map<String, Object> userAttributes = new HashMap<>();
//	        userAttributes.put("login",oAuth2User.getAttribute("login"));
//	        userAttributes.put("url",oAuth2User.getAttribute("html_url"));
//	        System.out.println(userAttributes);
//	       return userAttributes;
//	//	return "<h1>Hello </h1> "+principal.getName();
//	      // return oAuth2User.getAttributes();
//	}

}
