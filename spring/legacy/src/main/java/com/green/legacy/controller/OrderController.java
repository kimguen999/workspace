package com.green.legacy.controller;


import com.green.legacy.dto.ChickenDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chickens")
@RequiredArgsConstructor
public class OrderController {


  @RequestMapping("/order")
  public String goOrder(){
    return "order";
  }
  @RequestMapping("/delivery")
  public String delivery(@ModelAttribute ChickenDTO chickenDTO, Model model){
    model.addAttribute("chicken", chickenDTO);
    System.out.println(chickenDTO);
    return "delivery";
  }

  @RequestMapping("/show")
  public String show(@ModelAttribute DeliveryDTO deliveryDTO,
                     @ModelAttribute ChickenDTO chickenDTO, Model model){
    System.out.println(deliveryDTO);
    System.out.println(chickenDTO);
    model.addAttribute("delivery", deliveryDTO);
    model.addAttribute("chicken", chickenDTO);

    return "order_info";
  }




}
