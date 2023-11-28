package com.services.session;

import javax.servlet.http.HttpSession;
import com.model.app.ServiceLocator;

public class SessionService_Http implements SessionService {

	private HttpSession httpSession;

	@Override
	public void destroy() {
	};

	public SessionService_Http() {
	}

	@Override
	public void init() {
		httpSession = ServiceLocator.getHttpSession();
	}

	@Override
	public void set(String name, Object data) {
		httpSession.setAttribute(name, data);

	}

	@Override
	public Object get(String name) {
		return httpSession.getAttribute(name);
	}

	@Override
	public void delete(String name) {
		httpSession.removeAttribute(name);

	}

}
