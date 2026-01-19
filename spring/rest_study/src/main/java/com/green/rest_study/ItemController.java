package com.green.rest_study;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

  private List<ItemDTO> itemDTOList;
  private ItemController(){

    itemDTOList = new ArrayList<>();

    itemDTOList.add(new ItemDTO(1,"홈런볼",1500,"오리온"));
    itemDTOList.add(new ItemDTO(2,"칸쵸",1200,"해태"));
    itemDTOList.add(new ItemDTO(3,"콘칩",1800,"크라운"));
    itemDTOList.add(new ItemDTO(4,"빈츠",2400,"롯데"));
    itemDTOList.add(new ItemDTO(5,"포스틱",1600,"해태"));

  }

  //목록조회
  @GetMapping("")
  public List<ItemDTO> getItemList(){
    return itemDTOList;
  }

  //하나의 상품 조회
  @GetMapping("/{num}")
  public ItemDTO getOneItemList(@PathVariable("num") int num){
    ItemDTO result = null;
    for (int i = 0; i<itemDTOList.size(); i++){
      if (itemDTOList.get(i).getNum()==num){
        result = itemDTOList.get(i);
        break;
      }
    }
    return result;
  }

  //삭제
  @DeleteMapping("/{delNum}")
  public List<ItemDTO> deleteItemList(@PathVariable("delNum") int delNum){
    for (int i = 0; i<itemDTOList.size(); i++){
      if (itemDTOList.get(i).getNum()==delNum){
        itemDTOList.remove(i);
        break;
      }
    }
    return itemDTOList;
  }




}
