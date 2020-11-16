package com.bai.eduservice.client.fallback;

import com.bai.eduservice.client.OrdersClient;
import org.springframework.stereotype.Component;

@Component
public class OrdersFileDegradeFeignClient implements OrdersClient {
    @Override
    public boolean isBoughtCourse(String courseId, String memberId) {
        return false;
    }
    //出错之后会执行

}
