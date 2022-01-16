package me.study.springcloud.catalog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CatalogService {

    private final CatalogRepository catalogRepository;

    public List<GetCatalogResponse> getCatalogs() {
        return catalogRepository.findAll().stream()
                .map(GetCatalogResponse::new)
                .toList();
    }

}
