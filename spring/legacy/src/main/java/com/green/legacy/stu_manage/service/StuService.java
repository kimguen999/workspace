package com.green.legacy.stu_manage.service;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import com.green.legacy.stu_manage.mapper.StuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StuService {

  private final StuMapper stuMapper;

  // 반 조회
  public List<ClassDTO> selectClassList(){
    return stuMapper.selectClassList();
  };

  // 전체 학생 조회
  public List<StuDTO> selectStudentList(int classNum){
    return stuMapper.selectStudentList(classNum);
  };

//  // 반별 학생 조회
//  public List<StuDTO> selectStudentClassList(int classNum){
//    return stuMapper.selectStudentClassList(classNum);
//  }

  // 학생별 점수 조회 기능
  public ScoreDTO selectScore(int stuNum){
    return stuMapper.selectScore(stuNum);
  }

}
