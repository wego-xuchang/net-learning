package com.netlearning.manage.cms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netlearning.api.cms.CmsConfigControllerApi;
import com.netlearning.framework.domain.cms.CmsConfig;
import com.netlearning.manage.cms.service.CmsPageService;


@RestController
@RequestMapping("/cms/config")
public class CmsConfigController implements CmsConfigControllerApi {

    @Autowired
    CmsPageService cmsPageService;

    @Override
    @GetMapping("/getmodel/{id}")
    public CmsConfig getmodel(@PathVariable("id") String id) {
        return cmsPageService.getConfigById(id);
    }
}
