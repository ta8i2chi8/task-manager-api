package jp.taichi.morimoto.taskmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaskManagerController {
  
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String getHello() {
    return "Hello World";
  }
}