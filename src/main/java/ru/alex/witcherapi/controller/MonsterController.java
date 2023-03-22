package ru.alex.witcherapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alex.witcherapi.dto.MonsterBaseDto;
import ru.alex.witcherapi.service.MonsterService;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/monster")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService monsterService;

    @GetMapping("/class/all")
    public ResponseEntity<List<MonsterBaseDto>> getMonsterClassList() {
        return ResponseEntity.ok(monsterService.getMonsterClassList());
    }
}