package com.ssk.sh.controller;

import com.ssk.sh.core.api.ResultVo;
import com.ssk.sh.core.enums.DemoStatus;
import com.ssk.sh.req.DemoInfoReq;
import com.ssk.sh.res.DemoInfoRes;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author T0220165
 */
@RestController
public class DemoController {

    @PostMapping(value = "demo")
    public ResultVo<DemoInfoRes> getDemoInfo(@Validated @RequestBody DemoInfoReq req) {
        DemoInfoRes demoInfoRes = new DemoInfoRes();
        demoInfoRes.setName("ssk");
        demoInfoRes.setPrice(new BigDecimal(100));
        demoInfoRes.setRemark("remark");
        demoInfoRes.setStatus(DemoStatus.SUCCESS);
        return new ResultVo<>(demoInfoRes);
    }

}
