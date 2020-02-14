package com.bit.framework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BitController {

	String execute(HttpServletRequest req) 
			throws ServletException, IOException;
}