package com.softgroup.common.protocol;

import java.io.Serializable;

public class RoutedAction<T extends Serializable> extends Action<T> {
	private static final long serialVersionUID = -318012176965757271L;
	//field routing Data - service field
	// ClientID for us to work - handlers know who works
	// created where client makes request

	//separate class RoutingData - inside server info

}
