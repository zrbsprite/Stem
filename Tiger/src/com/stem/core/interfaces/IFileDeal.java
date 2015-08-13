package com.stem.core.interfaces;

import java.io.InputStream;

public interface IFileDeal {

	public String store(InputStream stream, String fileName);
	
	public <T> T fetch(String path);
}
