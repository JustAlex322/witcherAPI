package ru.alex.witcherapi.service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;
import ru.alex.witcherapi.dto.MonsterBaseDto;
import ru.alex.witcherapi.entity.MonsterClass;

import java.util.List;

public interface MonsterClassService {
    List<MonsterBaseDto> getMonsterClassList();

    MonsterClass getMonsterClassById(Long id);

    void uploadClass(@NotBlank String className, @NotNull MultipartFile classImg);
}
