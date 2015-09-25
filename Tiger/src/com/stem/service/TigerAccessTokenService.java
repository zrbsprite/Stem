package com.stem.service;

import com.stem.core.interfaces.BasicService;
import com.stem.entity.TigerAccessToken;
import com.stem.entity.TigerAccessTokenExample;

public interface TigerAccessTokenService extends
		BasicService<TigerAccessTokenExample, TigerAccessToken> {

	public TigerAccessToken getOne(String id);
}
