package com.green.legacy.stu_manage.controller;


import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.service.StuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
@RequiredArgsConstructor
public class StuController {
  private final StuService stuService;


  // 학생목록페이지
  @RequestMapping("/main")
  public String main(@RequestParam(name = "classNum", required = false, defaultValue = "0") int classNum, Model model){
    // 전달되는 학급번호
    System.out.println("classNum = "+classNum);

    // 반 조회
    List<ClassDTO> classList = stuService.selectClassList();
    // 전체 학생 조회
    List<StuDTO> studentList = stuService.selectStudentList(classNum);
//    // 반별 학생 조회
//    List<StuDTO> studentClassList = stuService.selectStudentClassList(classNum);

    model.addAttribute("classList", classList);
    model.addAttribute("studentList", studentList);
    model.addAttribute("selectedClassNum", classNum);


    return "stu/stu_manage";
  }

  @ResponseBody  // 비동기 메서디임을 인지
  @RequestMapping("/list")
  public List<StuDTO> getStuList(@RequestParam(name = "classNum") int classNum){

    return stuService.selectStudentList(classNum);
  }

  // 학생별 점수 조회
  @ResponseBody
  @RequestMapping("/score")
  public ScoreDTO selectScore(@RequestParam(name = "stuNum") int stuNum){
    return stuService.selectScore(stuNum);
  }

  // 점수 등록 or 업데이트
  @ResponseBody
  @RequestMapping("/score-save")
  public void saveScore(@RequestBody ScoreDTO scoreDTO){
    stuService.saveScore(scoreDTO);
  }


}
