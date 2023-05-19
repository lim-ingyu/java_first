package kr.kh.onAirAuction.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.kh.onAirAuction.pagination.Criteria;
import kr.kh.onAirAuction.pagination.PageMaker;
import kr.kh.onAirAuction.service.MainService;
import kr.kh.onAirAuction.vo.FileVO;
import kr.kh.onAirAuction.vo.ProductVO;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	
	@RequestMapping(value = "/",  method=RequestMethod.GET)
	public ModelAndView home(ModelAndView mv, Integer pr_code, Integer fi_num) {
		ArrayList<ProductVO> list = mainService.getProductList(pr_code);
		ArrayList<FileVO> files = mainService.getFileList(fi_num);
    	mv.addObject("list", list);
    	mv.addObject("files", files);
		mv.setViewName("/main/home");	
		return mv;
	}
		

}

