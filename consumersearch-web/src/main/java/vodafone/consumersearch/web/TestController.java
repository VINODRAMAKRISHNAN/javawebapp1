package vodafone.consumersearch.web;





import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vodafone.consumersearch.utility.BCalculator;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Resource
	ACalculator _acalc;
	
	//@Resource
	BCalculator _bcalc=new BCalculator();
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		int a = _acalc.addMe(10,20);
		int b = _acalc.addMe(20,30);
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("a", String.valueOf(a) );
		model.addAttribute("b", String.valueOf(b));
		return "helloworld";
	}
}