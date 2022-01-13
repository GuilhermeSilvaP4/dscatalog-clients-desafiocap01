package com.devsuperior.desafiocap01.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.desafiocap01.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Guilherme Silva", "096652xxxxx,", 1000.300,null, 2));
		list.add(new Client(1L, "Kauã Silva", "096655xxxxx", 1050.30, null, 0));
		return ResponseEntity.ok().body(list);
		
	}
}
