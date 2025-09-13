package com.psf.dto.response;

import com.psf.dto.ResponseDto;

public class TeacherSignInResponseDTO extends ResponseDto {
    private int insertCount;

    public int getInsertCount() {
        return insertCount;
    }

    public void setInsertCount(int insertCount) {
        this.insertCount = insertCount;
    }
}
