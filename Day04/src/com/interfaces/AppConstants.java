package com.interfaces;

public interface AppConstants {
	String ApplicationId = "Quick Books";
	double VersionNo = 12.3;
	String ServiceUrl = "https://server:port/api";
	default String getServiceUrl() {
		return ServiceUrl;
	}
}

class MyConstants implements AppConstants {
	public String getServiceUrl() {
		return "hello world";
	}
}
