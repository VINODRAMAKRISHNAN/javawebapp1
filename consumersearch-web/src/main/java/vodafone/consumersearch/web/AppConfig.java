package vodafone.consumersearch.web;

import org.springframework.stereotype.Component;


public class AppConfig {
	private String dbname;
	private String url;
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
