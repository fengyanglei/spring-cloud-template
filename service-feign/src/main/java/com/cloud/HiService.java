package com.cloud;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Layne on 2018-8-30.
 */
@FeignClient(value = "service-hi")
public interface HiService extends com.cloud.api.HiService {
}
