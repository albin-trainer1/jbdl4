package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FundTransactionDto;
import com.example.service.FundTransferService;

@RestController
public class FundTransferApi {
	@Autowired
	private FundTransferService fundTransferService;
@PutMapping("fundTransfer")
	public String fundTransfer( @RequestHeader("loggedInUser")  int userId,
			@RequestBody FundTransactionDto dto) {
		dto.setAccId(userId);
		fundTransferService.fundTransfer(dto);
		return "Success";
	}
}
