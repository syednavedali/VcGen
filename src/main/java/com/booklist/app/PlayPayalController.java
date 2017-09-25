package com.booklist.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PlayPayalController {
	@RequestMapping("/")
	String home(ModelMap modal) {
		//modal.addAttribute("title", "Dear Learner");
		//modal.addAttribute("message", "Welcome to SpringBoot");
		String status = "Playing Chan Chan";
		try {
		      String line;
		      Process p = Runtime.getRuntime().exec("sudo omxplayer 1.mp3");
		      //p.waitFor();
		      //System.out.println(p.exitValue());
		    }
		    catch (Exception err) {
		      err.printStackTrace();
		      status = "Error";
		    }
		finally
		{
			return status;
		}
	}

}
