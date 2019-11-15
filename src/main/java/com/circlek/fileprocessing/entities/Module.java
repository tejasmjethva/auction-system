package com.circlek.fileprocessing.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ 
	@NamedQuery(name = Module.GET_MODULELIST, query = "SELECT DISTINCT m.moduleName FROM Module m"),
	@NamedQuery(name = Module.FIND_BY_MODULENAME, query = "FROM Module WHERE moduleName = : moduleName")})

public class Module {

	public static final String GET_MODULELIST = "getModuleList";
	
	public static final String FIND_BY_MODULENAME = "findByModuleName";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Basic
	private String moduleName;
	
	@Basic
	private String interfaceId;
	
	@Basic
	private String tempLocation;
	
	@Basic
	private String errorLocation;
	
	@Basic
	private String inboundLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
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
//	public List<InterfaceId> getInterfaceIdList() {
//		return interfaceIdList;
//	}
//
//	public void setInterfaceIdList(List<InterfaceId> interfaceIdList) {
//		this.interfaceIdList = interfaceIdList;
//	}
	
}
