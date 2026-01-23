package com.green.item.mapper;

import com.green.item.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //객체생성 + 쿼리 실행 메서드 파일이라는 것을 인식시켜주는 역할
public interface ItemMapper {

  //상품 등록 쿼리 실행 메서드
  void postItem(ItemDTO itemDTO);
  //상품 조회 쿼리 실행 메서드
  List<ItemDTO> selectItem();
  ItemDTO selectItem2(int itemNum);
}
