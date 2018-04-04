package io.rscale.producer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProducerController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ProducerModel message() {
		return new ProducerModel("Hi There!");
	}
	
}
