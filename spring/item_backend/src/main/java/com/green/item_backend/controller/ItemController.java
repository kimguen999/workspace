package com.green.item_backend.controller;

import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

  private ItemService itemService;
  public ItemController(ItemService itemService){
    this.itemService = itemService;
  }

  // (get) http://localhost:8080/items
  @GetMapping("/items")
  public List<ItemDTO> itemInfo(){
    return itemService.itemInfo();
  }


}
