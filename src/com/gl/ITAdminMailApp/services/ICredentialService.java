package com.gl.ITAdminMailApp.services;

import com.gl.ITAdminMailApp.beans.Employee;

public interface ICredentialService {
	public String generateEmailAddress(Employee employee);
	public String generatePassword();
}
