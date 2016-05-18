package shopping2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shopping2.model.Item;
import shopping2.service.ItemService;
@Controller
public class IndexController {
	@Autowired
	private ItemService is;
	@RequestMapping("index")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<Item> list = is.listItem();
		mav.addObject("list", list);
		mav.setViewName("list");
		return mav;
	}
	@RequestMapping("detail")
	public ModelAndView detail(int itemId) {
		ModelAndView mav = new ModelAndView();
		Item item = is.selectItem(itemId);
		mav.addObject("item", item);
		mav.setViewName("detail");
		return mav;
	}
}