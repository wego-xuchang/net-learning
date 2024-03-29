package com.netlearning.api.cms;

import com.netlearning.framework.domain.cms.CmsPage;
import com.netlearning.framework.domain.cms.request.QueryPageRequest;
import com.netlearning.framework.domain.cms.response.CmsPageResult;
import com.netlearning.framework.model.response.QueryResponseResult;
import com.netlearning.framework.model.response.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
    //页面查询
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value = "页码",required=true,paramType="path",dataType="int"),
            @ApiImplicitParam(name="size",value = "每页记录数",required=true,paramType="path",dataType="int")
    })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
    
    @ApiOperation("添加")
    public CmsPageResult add(CmsPage cmsPage);
    
    @ApiOperation("修改")
    public  CmsPageResult  edit(String id, CmsPage cmsPage);
    
    @ApiOperation("删除")
    public ResponseResult delete(String id);
    
    @ApiOperation("根据id查找")
    public CmsPage findById(String id);

    //页面发布
    @ApiOperation("页面发布")
    public ResponseResult post(String pageId);
}
