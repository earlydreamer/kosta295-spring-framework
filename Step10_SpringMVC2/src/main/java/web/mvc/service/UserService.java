package web.mvc.service;

import web.mvc.exception.BasicException;

public interface UserService {

	/**
	 * ����üũ
	 */
	void ageCheck(int age) throws BasicException;
	/**
	 * �ߺ�üũ
	 */
	void idCheck(String id) throws BasicException;
}
