package com.services.session;

import com.model.app.Service;

public interface SessionService extends Service {

	public void set(String name, Object data);

	public Object get(String name);

	public void delete(String name);

}
