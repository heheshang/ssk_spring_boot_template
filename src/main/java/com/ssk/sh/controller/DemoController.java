package com.ssk.sh.controller;

import com.ssk.sh.core.enums.DemoStatus;
import com.ssk.sh.req.DemoInfoReq;
import com.ssk.sh.res.DemoInfoRes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author T0220165
 */
@RestController
@Tag(name = "demo")
public class DemoController {

    @Operation(summary = "demo")
    @PostMapping(value = "demo")
    public DemoInfoRes getDemoInfo(@Validated @RequestBody DemoInfoReq req) {
        DemoInfoRes demoInfoRes = new DemoInfoRes();
        demoInfoRes.setName("ssk");
        demoInfoRes.setPrice(new BigDecimal(100));
        demoInfoRes.setRemark("remark");
        demoInfoRes.setStatus(DemoStatus.SUCCESS);
        return demoInfoRes;
    }

}
