package com.rajeshwar.ai.analyzer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshwar.ai.analyzer.vo.ExceptionCountResponse;
import com.rajeshwar.ai.analyzer.vo.FileRequest;

@RestController
@RequestMapping(path="/analyzer")
public class AnalyzerController {
	@RequestMapping(path="/loadFile",consumes= {MediaType.APPLICATION_JSON_VALUE},method={RequestMethod.POST})
	public String loadLogFile(@RequestBody FileRequest file) {
		return file.getName();
	}
	
	@RequestMapping(path="/exceptions",consumes= {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE},method={RequestMethod.GET})
	public ExceptionCountResponse getExceptions(@RequestBody FileRequest file) {
		ExceptionCountResponse res = new ExceptionCountResponse();
		populateResponse(res);
		return res;
	}
	
	@RequestMapping(path="/exceptions/words",consumes= {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_JSON_VALUE},method={RequestMethod.GET})
	public ExceptionCountResponse getWordCount(@RequestBody FileRequest file) {
		ExceptionCountResponse res = new ExceptionCountResponse();
		res.update("Find", 2);
		res.update("out", 2);
		res.update("block", 3);
		res.update("invalid", 6);
		return res;
	}

	private void populateResponse(ExceptionCountResponse res) {
		res.update("ArrayIndexOutOfBound", 4);
		res.update("NumberFormatException", 2);
		res.update("ServiceException", 6);
		res.update("ConnectionException", 3);
		
	}
	
	
}
