package com.example.wesynergize.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wesynergize.model.WeSynergizeModel;
import com.example.wesynergize.service.WeSynergizeService;

@RestController
@RequestMapping("wesynergize")
public class WeSynergizeController {
	@Autowired
	private WeSynergizeService weSynergizeService;
	
	 // Save operation
    @PostMapping("/add")
    public WeSynergizeModel add(@RequestBody WeSynergizeModel model)
    {
        return weSynergizeService.add(model);
    }
  
    // Read operation
    @GetMapping("/getall")
    public List<WeSynergizeModel> getAll()
    {
        return weSynergizeService.getAll();
    }
  
    // Update operation
    @PutMapping("/update/{id}")
    public WeSynergizeModel update(@RequestBody WeSynergizeModel model,
                     @PathVariable int Id)
    {
        return  weSynergizeService.update(
            model,Id);
    }
  
    // Delete operation
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return weSynergizeService(id);
    }

	private String weSynergizeService(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}


