package com.psf.service;

import com.psf.domain.User;
import com.psf.dto.ResponseDto;
import com.psf.dto.Request.SignInUserDto;
import com.psf.dto.response.TeacherSignInResponseDTO;
import com.psf.repository.TeacherRepository;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class TeacherService {
    public ResponseDto signIn(SignInUserDto dto) throws SQLException {
        User user = new User();

        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setCreatedDate(LocalDateTime.now());

        TeacherRepository teacherRepository = new TeacherRepository();

        int result = teacherRepository.save(user);
        TeacherSignInResponseDTO  resultDto = new TeacherSignInResponseDTO();
        if (result<=0){
            resultDto.setStatus("BAD REQUEST - 401");
            resultDto.setMessage("Veri tabanına veri kaydedilemedi.");
            return resultDto;
        }
        else {
            resultDto.setStatus("SUCCESS - 200");
            resultDto.setMessage("Kayıt işlemi başarılı");
            resultDto.setInsertCount(result);
            return resultDto;
        }
    }
}
