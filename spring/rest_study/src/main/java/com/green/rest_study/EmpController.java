package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {

  public List<Emp> empList;

  public EmpController(){

    empList = new ArrayList<>();

    empList.add(new Emp(101,"John Wick","영업부",50000,"이사"));
    empList.add(new Emp(102,"Bowery King","뉴욕",20000,"전무"));
    empList.add(new Emp(103,"Aurelio","차량부",10000,"차장"));
    empList.add(new Emp(104,"Winston","뉴욕 컨티넨탈",80000,"상무"));
    empList.add(new Emp(105,"Charon","뉴욕부",20000,"부장"));

  }
  @GetMapping("")
  public List<Emp> getEmpList(){
    System.out.println("사원목록조회");
    return empList;
  }

  @GetMapping("/{empNum}")
  public Emp getOneEmp(@PathVariable("empNum") int empNum){
    Emp result = null;
    for (int i = 0; i<empList.size(); i++){
      if (empList.get(i).getEmpNum() == empNum){
        result = empList.get(i);
        break;
      }
    }
    return result;
  }

  @PostMapping("")
  public List<Emp> postOneEmp(@RequestBody Emp emp){
    empList.add(emp);
    return empList;
  }

  //{
  //    "empNum" : 106,
  //    "empName" : "Santino D'Antonio",
  //    "empPart" : "The High Table",
  //    "empSalary" : 150000,
  //    "empRank" : "부회장"
  //}

  @DeleteMapping("/{empNum}")
  public List<Emp> deleteOneEmp(@PathVariable("empNum") int empNum){
    for (int i = 0; i<empList.size(); i++){
      if (empList.get(i).getEmpNum() == empNum){
        empList.remove(i);
        break;
      }
    }
    return empList;
  }
  @PutMapping("/{empNum}")
  public List<Emp> updateOneEmp(@PathVariable("empNum") int empNum, @RequestBody Emp emp){
    for (int i = 0; i<empList.size(); i++){
      if (empList.get(i).getEmpNum() == empNum){
        empList.get(i).setEmpSalary(emp.getEmpSalary());
        empList.get(i).setEmpPart(emp.getEmpPart());
      }
    }
    return empList;
  }

}
