package com.green.item_backend.service;

import com.green.item_backend.dto.ItemDTO;
import com.green.item_backend.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ItemService {
  @Autowired

  private ItemMapper itemMapper;

  public List<ItemDTO> itemInfo(){

    return itemMapper.itemInfo();
  }
}
