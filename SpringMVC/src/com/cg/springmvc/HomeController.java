package com.cg.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*Step 2*/

@Controller //@controller extends of @component so that it can be picked up during component scan  
public class HomeController
{
	/* Step 4 */
	@RequestMapping("/")
	/* Step 3 */
	public String showPage()
	{
		return "main-menu";
	}
}
