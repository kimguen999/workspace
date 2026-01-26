package com.green.item.service;

import com.green.item.dto.ItemDTO;
import com.green.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 객체생성 + 핵심기능이 있다는 것을 알려줌
public class ItemService {


  private ItemMapper itemMapper;

  // @Autowired : 클래스의 생성자가 하나만 존재하면 해당 생성자에 @Autowired 어노테이션이 자동으로 붙는다.
  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }

  //상품 등록 기능 실행 메서드
  public void runPost1(ItemDTO itemDTO){
    System.out.println(itemDTO);
    // 상품등록 쿼리 실행
    itemMapper.postItem(itemDTO);
  }

  // 상품 리스트 조회 기능 실행 메서드
  public List<ItemDTO> runSelect1(){
    List<ItemDTO> result = itemMapper.selectItem();
    return result;
  }

  // 상품 상세 정보 조회 기능 실행 메서드
  public ItemDTO runselect2(int itemNum){
    ItemDTO result = itemMapper.selectItem2(itemNum);
    return result;
  }

  // 상품 수정 기능 실행 메서드
  public ItemDTO update(ItemDTO itemDTO){
    itemMapper.updateItem(itemDTO);
    return itemDTO;
  }
//  public void update(ItemDTO itemDTO){
//    itemMapper.updateItem(itemDTO);
//  }

  public void delete(int itemNum){
    itemMapper.deleteItem(itemNum);
  }

}
