package com.green.legacy.stu_manage.mapper;

import com.green.legacy.stu_manage.dto.ClassDTO;
import com.green.legacy.stu_manage.dto.ScoreDTO;
import com.green.legacy.stu_manage.dto.StuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StuMapper {

  // 반 조회
  List<ClassDTO> selectClassList();

  // 전체 학생 조회
  List<StuDTO> selectStudentList(int classNum);

//  // 반별 학생 조회
//  List<StuDTO> selectStudentClassList(int classNum);

  // 학생별 점수 조회
  ScoreDTO selectScore(int stuNum);

  // 점수 등록 or 업데이트
  void saveScore(ScoreDTO scoreDTO);


}
