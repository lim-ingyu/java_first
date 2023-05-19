package kr.kh.onAirAuction.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.onAirAuction.dao.MainDAO;
import kr.kh.onAirAuction.pagination.Criteria;
import kr.kh.onAirAuction.vo.FileVO;
import kr.kh.onAirAuction.vo.ProductVO;

@Service
public class MainServiceImp implements MainService {

	@Autowired
	MainDAO mainDao;
	
	@Override
	public ArrayList<ProductVO> getProductList(Integer pr_code) {
		return mainDao.selectProduct(pr_code);
	}

	@Override
	public ArrayList<FileVO> getFileList(Integer fi_num) {
		return mainDao.selectFileList(fi_num);
	}
	

}
