package shopping2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shopping2.model.Item;
import shopping2.service.ItemService;
@Controller
public class DetailController {
	@Autowired
	private ItemService is;
	@RequestMapping("detail")
	public ModelAndView detail(int itemId) {
		ModelAndView mav = new ModelAndView();
		Item item = is.selectItem(itemId);
		mav.addObject("item", item);
		mav.setViewName("detail");
		return mav;
	}
}