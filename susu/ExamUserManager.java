package com.example.cptProject;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class ExamUserManager {
    private static final String FILE_PATH = "exam_user.json";

    // 응시자 이름 저장
    public static void saveUserName(String userName) {
        JSONPObject user = new JSONPObject();
        user.put("name", userName);
    }
    
}