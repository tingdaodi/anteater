package com.pn.anteater.payment.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/1/6 22:04
 * @since 1.0
 */
@RestController
@RequestMapping("/demo")
@Api(value = "测试Swagger2", description = "简单的API")
public class UserController {

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "java.lang.Long", name = "id", value = "id", required = true, paramType = "path"),
            @ApiImplicitParam(dataType = "User", name = "user", value = "用户信息", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 500, message = "接口异常"),
    })
    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public User insert(@PathVariable Long id, @RequestBody User user) {

        System.out.println("id:" + id + ", user:" + user);
        user.setId(id);

        return user;
    }

}
