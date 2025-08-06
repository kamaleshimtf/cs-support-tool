package com.imtf.cstool.supporttool.service;

import com.imtf.cstool.supporttool.constant.SupportToolConstant;
import com.imtf.cstool.supporttool.helper.FileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemInfoService {

    private final Logger logger = LoggerFactory.getLogger(SystemInfoService.class);

    @Autowired
    FileManager fileManager;

    public void getSystemInfo(){

        String tempDir = fileManager.createTempDirectory();

        String createSystemFolder = fileManager.createSubFolder(tempDir, SupportToolConstant.SYSTEM_INFO_FOLDER_NAME);




    }

    public void createSystemInfo(){

       // String createFil
    }
}
