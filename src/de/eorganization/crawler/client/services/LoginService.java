package de.eorganization.crawler.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.eorganization.crawler.client.model.LoginInfo;
import de.eorganization.crawler.client.model.Member;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public LoginInfo login(String requestUri) throws Exception;

	public Member registerMember(Member member) throws Exception;

	public Member updateMember(Member member);

	public boolean memberExists(String email);
}
