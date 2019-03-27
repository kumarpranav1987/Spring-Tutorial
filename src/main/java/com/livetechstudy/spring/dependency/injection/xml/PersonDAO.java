package com.livetechstudy.spring.dependency.injection.xml;

public class PersonDAO {
	private XmlJDBCConnection xmlJdbcConnection;

	public XmlJDBCConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJDBCConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}
	
	
}
