package com.xero.api;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class CustomDateModule extends SimpleModule {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public CustomDateModule() {
	 //       addDeserializer(LocalDate.class, new CustomDateDeserializer());
	    }
	}


