package com.psf.controller;

import com.psf.controller.validation.TeacherValidation;
import com.psf.dto.ResponseDto;
import com.psf.dto.Request.SignInUserDto;
import com.psf.service.TeacherService;

public class TeacherController {

    public ResponseDto signIn(SignInUserDto dto){
        try {
            if (TeacherValidation.isValid(dto)){
                return null;
            }
            TeacherService teacherService = new TeacherService();
            ResponseDto result =  teacherService.signIn(dto);
            return result;
        }catch (Exception e){
            System.out.println("Beklenmedik bir hata oluştu.");
            return null;
        }
    }
}
