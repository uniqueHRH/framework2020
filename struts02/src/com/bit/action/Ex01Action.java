package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
/*
	�� �� �ִ� �Ӽ��� �� �ټ� ��
	  public static final java.lang.String SUCCESS = "success";
	  public static final java.lang.String NONE = "none";			�׼��� ���������� ����Ǿ�����, ȭ�� ����� �ȵ� ��
	  public static final java.lang.String ERROR = "error";
	  public static final java.lang.String INPUT = "input";			�Է°��� �����ϰų� ������ ���� ��, �Է� �������� ���ư�
	  public static final java.lang.String LOGIN = "login";			�α��� ���� ����, �׼��� �Ұ����ϹǷ� �α��� �������� �̵�
*/
		
//		return "success";
//		return "error";
		return this.SUCCESS;
//		return this.ERROR;
	}

}
