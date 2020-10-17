package com.castoldi.springsleuthdemo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castoldi.springsleuthdemo.dto.PlayerDto;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

	@GetMapping
	public List<PlayerDto> getPlayers() {
		List<PlayerDto> players = new ArrayList<PlayerDto>();
		players.add(new PlayerDto("name1", new Date()));
		players.add(new PlayerDto("name2", new Date()));
		players.add(new PlayerDto("name3", new Date()));

		return players;
	}
}
