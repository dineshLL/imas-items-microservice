package org.imas.client;

import java.io.Serializable;

import javax.json.JsonObject;
import javax.json.spi.JsonProvider;

import org.imas.actors.AbstaractActor;
import org.imas.actors.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetItemActor extends AbstaractActor {

	Logger logger = LoggerFactory.getLogger(GetItemActor.class);
	
	public GetItemActor() {
		super("get");
	}

	@Override
	public Serializable act(JsonObject payload) {
		logger.info("get items service executing...");
		
		sendMessage(new Action("log", "info"), JsonProvider.provider().createObjectBuilder().add("message", "from get items service").build());
		return null;
	}

}
