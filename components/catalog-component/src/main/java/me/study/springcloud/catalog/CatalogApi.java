package me.study.springcloud.catalog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog-service")
public class CatalogApi {

    private final CatalogService catalogService;

    @GetMapping("/catalogs")
    public List<GetCatalogResponse> getCatalogs() {
        return catalogService.getCatalogs();
    }

}
