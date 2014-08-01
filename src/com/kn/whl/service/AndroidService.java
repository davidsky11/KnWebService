package com.kn.whl.service;

import javax.jws.WebService;

import com.kn.whl.entity.Android;

@WebService
public interface AndroidService {
	public Android getAndroidVersion();
}
