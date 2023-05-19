package kr.kh.onAirAuction.service;

import java.util.ArrayList;

import kr.kh.onAirAuction.pagination.Criteria;
import kr.kh.onAirAuction.vo.FileVO;
import kr.kh.onAirAuction.vo.ProductVO;

public interface MainService {

	ArrayList<ProductVO> getProductList(Integer pr_code);

	ArrayList<FileVO> getFileList(Integer fi_num);

}
