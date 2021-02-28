package io.baizi.demo.elkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juwencheng
 * @date 2020 2020/5/11 10:15 下午
 */
@Slf4j
@RestController
public class Controller {

    @GetMapping("error")
    public void getError() {
        int result = 1 / 0;
//        throw new RuntimeException("发生异常");
    }
}
