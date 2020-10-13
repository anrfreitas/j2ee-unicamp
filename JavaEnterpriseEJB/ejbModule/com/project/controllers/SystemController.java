package com.project.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SystemController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* This class will hold ambient variables like temporary messages that will display alerts to the user */
	
	private static String tmpMessage = "";
	
	public static void limparCacheMensagem() { tmpMessage = ""; }

	public static String getTmpMessage() {
		return tmpMessage;
	}

	public static void setTmpMessage(String tmpMessage) {
		SystemController.tmpMessage = tmpMessage;
	}
	
}
