package com.springboot.tao.controller;

import com.springboot.tao.bean.db.Student;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author taozhiwei
 * @date 2020/7/27 18:05
 * 访问http://localhost:8080/swagger-ui.html
 * 或者自己定义一个url跳转到swagger-ui.html
 */
@RestController
@Api(value = "swagger类注释", tags = {"swagger tags"})
@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation(value = "方法解释", notes = "notes", httpMethod = "GET")
    @ApiResponses(value = { @ApiResponse(code = 1000, message = "成功"),
                            @ApiResponse(code = 1001, message = "失败"),
                            @ApiResponse(code = 1002, response = Student.class,message = "缺少参数") })
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "int", name = "doc", value = "doc", example = "doc", allowableValues = "range[1,5]"),
            //@ApiImplicitParam(paramType = "student", name = "student", value = "student", required = true)
    })
    @GetMapping("/doc")
    public Student info(@Param("doc")int doc, Student student){
        return student;
    }

    @GetMapping("/ui")
    public void doc(HttpServletResponse response) throws IOException {
        //因为用了@RestController 导致redirect失效
        //需要注意的是此时url是http://localhost:8080/swagger/ui
        //response.sendRedirect("swagger-ui.html")  跳转  http://localhost:8080/swagger/swagger-ui.html
        //response.sendRedirect("/swagger-ui.html") 跳转  http://localhost:8080/swagger-ui.html
        //return "redirect:swagger-ui.html";
        response.sendRedirect("/swagger-ui.html");
    }
}
