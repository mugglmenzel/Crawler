package de.eorganization.crawler.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.eorganization.crawler.client.model.LoginInfo;
import de.eorganization.crawler.client.model.Member;


public interface LoginServiceAsync {

	void login(String requestUri, AsyncCallback<LoginInfo> callback);

	void registerMember(Member member, AsyncCallback<Member> callback);

	void updateMember(Member member, AsyncCallback<Member> callback);

	void memberExists(String email, AsyncCallback<Boolean> callback);

}
