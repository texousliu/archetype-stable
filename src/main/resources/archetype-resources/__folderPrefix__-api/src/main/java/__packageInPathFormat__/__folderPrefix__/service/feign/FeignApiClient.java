package ${package}.${folderPrefix}.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

import ${package}.${folderPrefix}.service.feign.fallback.FeignServiceFallbackFactory;

@FeignClient(name = FeignService.NAME, fallbackFactory = FeignServiceFallbackFactory.class)
public interface FeignApiClient extends FeignService {

}