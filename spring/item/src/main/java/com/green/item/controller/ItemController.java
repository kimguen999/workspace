package com.green.item.controller;

import com.green.item.dto.ItemDTO;
import com.green.item.mapper.ItemMapper;
import com.green.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
  private ItemService itemService;

  @Autowired
  public ItemController(ItemService itemService){
    this.itemService = itemService;
  }
  //상품 등록 api
  @PostMapping("/post")
  public void postItem(@RequestBody ItemDTO itemDTO){
    itemService.runPost1(itemDTO);

  }

  // 상품 리스트 조회 api
  @GetMapping("/select")
  public List<ItemDTO> selectItem(){
    List<ItemDTO> result = itemService.runSelect1();
    return result;
  }

  @GetMapping("/select/{itemNum}")
  public ItemDTO selectItem2(@PathVariable int itemNum){
    ItemDTO result = itemService.runselect2(itemNum);
    return result;
  }

}
