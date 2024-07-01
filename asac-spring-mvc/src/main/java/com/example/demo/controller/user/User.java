package com.example.demo.controller.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private Integer age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String job;

}
// 지석쓰지석쓰지섞스 ㅣ나르ㅡㅡㅋㅇ르ㅡㅇ랑라ㅏㅏㅣ키맄리ㅣ깔깔깔깔