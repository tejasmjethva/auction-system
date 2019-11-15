package com.circlek.fileprocessing.entities;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class InterfaceId {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Basic
	private String interfaceId;
	
	@Basic
	private String tempLocation;
	
	@Basic
	private String errorLocation;
	
	@Basic
	private String inboundLocation;

	@Basic
	private String module;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getTempLocation() {
		return tempLocation;
	}

	public void setTempLocation(String tempLocation) {
		this.tempLocation = tempLocation;
	}

	public String getErrorLocation() {
		return errorLocation;
	}

	public void setErrorLocation(String errorLocation) {
		this.errorLocation = errorLocation;
	}

	public String getInboundLocation() {
		return inboundLocation;
	}

	public void setInboundLocation(String inboundLocation) {
		this.inboundLocation = inboundLocation;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
}
