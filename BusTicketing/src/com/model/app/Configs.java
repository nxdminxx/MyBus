package com.model.app;

public class Configs {
	public static String APP = "BusTicketing";

	public String getUrl(String path) {
		return "/" + APP + "/" + path;
	}
}
