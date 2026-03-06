package com.green.item_backend.mapper;

import com.green.item_backend.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

//  쿼리 실행 메서드
  List<ItemDTO> itemInfo();


}

