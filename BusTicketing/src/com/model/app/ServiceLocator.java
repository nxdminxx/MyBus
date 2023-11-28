package com.model.app;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.app.Service;
import com.authentication.AuthenticationService_Mock;
import com.services.session.SessionService_Http;

public class ServiceLocator {
	private static Boolean loaded = false;

	private static Map<String, Service> services;
	private static HttpServletRequest httpRequest;
	private static HttpServletResponse httpResponse;

	private static void registerService(String name, Service service) {
		services.put(name, service);
	}

	public static Service getService(String name) {
		return (Service) services.get(name);
	}

	public ServiceLocator() {

	}

	public static void loadServices() {
		if (loaded)
			return;
		services = new HashMap<String, Service>();

		// The services to be currently used needs to be configured manually here
		
		registerService("AUTHENTICATION_SERVICE", new AuthenticationService_Mock());
		registerService("SESSION_SERVICE", new SessionService_Http());

		loaded = true;
	}

	// This method is meant to forward http request and response to other services / consumer Java code
	public static void initServices(HttpServletRequest request, HttpServletResponse response) {
		httpRequest = request;
		httpResponse = response;

		for (String serviceName : services.keySet()) {
			Service service = services.get(serviceName);
			service.init();
		}
	}

	public static HttpServletRequest getHttpRequest() {
		return httpRequest;
	}

	public static HttpServletResponse getHttpResponse() {
		return httpResponse;
	}

	public static HttpSession getHttpSession() {
		if (httpRequest != null)
			return httpRequest.getSession();
		return null;
	}

}
