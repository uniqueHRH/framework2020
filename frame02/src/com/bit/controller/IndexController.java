package com.bit.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;
import com.bit.model.entity.EmpVo;

public class IndexController implements BitController {

	public String execute(HttpServletRequest req) {
		return "index";
	}
}

