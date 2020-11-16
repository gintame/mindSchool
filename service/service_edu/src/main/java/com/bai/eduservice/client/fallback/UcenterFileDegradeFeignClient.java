package com.bai.eduservice.client.fallback;

import com.bai.commonutils.ordervo.UcenterMemberOrder;
import com.bai.eduservice.client.UcenterClient;
import org.springframework.stereotype.Component;

@Component
public class UcenterFileDegradeFeignClient implements UcenterClient {
    @Override
    public UcenterMemberOrder getUserInfoOrder(String id) {
        return null;
    }
}
