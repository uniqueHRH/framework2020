package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.bit.framework.BitController;

public class IndexController implements BitController {

	@Override
	public String execute(HttpServletRequest arg0) throws ServletException,
			IOException {
		return "index";
	}

}
