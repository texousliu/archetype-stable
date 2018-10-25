#set( $symbol_pound = '"' )
package ${package}.${folderPrefix}.service.feign;

public interface FeignService {

    String NAME = ${symbol_pound}${artifactId}${symbol_pound};
    String PACKAGE = ${symbol_pound}${package}.${folderPrefix}.service${symbol_pound};

}