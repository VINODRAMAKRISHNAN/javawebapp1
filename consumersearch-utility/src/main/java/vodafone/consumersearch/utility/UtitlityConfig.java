package vodafone.consumersearch.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UtitlityConfig {

	AppConfig2 appconfig;
	
	@Autowired
	public void setCurappconfig(AppConfig2 appconf) {
		appconfig =appconf;
	}
	public AppConfig2 getCurappconfig() {
		return appconfig ;
	}
}


