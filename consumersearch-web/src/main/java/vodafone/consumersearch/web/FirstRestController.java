package vodafone.consumersearch.web;



import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vodafone.consumersearch.utility.BCalculator;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/rest")
public class FirstRestController {
	@Resource
	Student _student;
	
	//@Resource
	BCalculator _bcalc=new BCalculator();
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/callme", method = RequestMethod.GET)
	public @ResponseBody Student home() {
		logger.info("This is vinod.");
		_student.setFirstname("vinod");
		_student.setLastname("Ramakrishnan");
		return _student;
	}
}