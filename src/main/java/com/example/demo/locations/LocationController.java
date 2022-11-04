package com.example.demo.locations;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired
	LocationService ls;
	
	@RequestMapping(value = "/location")
	public List<Location> getAllLocations(){
		return ls.getAllLocations();
	}
	
	@RequestMapping(value = "/location/{id}")
	public Location getLocation(@PathVariable String id) {
		return ls.getLocation(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/location")
	public void addLocation(@RequestBody Location location) {
		ls.addLocation(location);
	}
	
	@PutMapping("/location/{id}")
	public String updateLocation(@PathVariable String id, @RequestBody Location location) {
		ls.updateLocation(id, location);
		return "Location update successfully";
	}
	
	@DeleteMapping("/location/{id}")
	public String deleteLocation(@PathVariable String id) {
		ls.deleteLocation(id);
		return "Location deleted successfully";
	}
}
