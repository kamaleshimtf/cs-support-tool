package com.imtf.cstool.supporttool.controller;

import com.imtf.cstool.supporttool.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/support")
public class SupportToolController {

    @Autowired
    SystemInfoService systemInfoService;

    @GetMapping(value = "/getsysteminfo")
    public String getSystemInfo(){
        systemInfoService.getSystemInfo();
        return "System Info";
    }
}
