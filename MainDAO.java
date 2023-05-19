package kr.kh.onAirAuction.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.kh.onAirAuction.pagination.Criteria;
import kr.kh.onAirAuction.vo.FileVO;
import kr.kh.onAirAuction.vo.ProductVO;

public interface MainDAO {

	ArrayList<ProductVO> selectProduct(@Param("pr_code")Integer pr_code);

	ArrayList<FileVO> selectFileList(@Param("fi_num")Integer fi_num);

}
