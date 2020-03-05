package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {
@RequestMapping("index")
public String home1()
{
	return "home";
}
@RequestMapping("about")
public String about()
{
	return "about";
}
@RequestMapping("contact")
public String contact()
{
	return "contact";
}
@RequestMapping("services")
public String services()
{
	return "services";
}
@RequestMapping("gallery")
public String gallery()
{
	return "gallery";
}
}
