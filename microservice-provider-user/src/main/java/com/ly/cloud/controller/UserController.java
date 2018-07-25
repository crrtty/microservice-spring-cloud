package com.ly.cloud.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ly.cloud.entity.User;
import com.ly.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {
	
	@Autowired
	private EurekaClient eurekaClient;
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@RequestMapping(value = "eureka-instance",method = RequestMethod.GET)
	public String serviceUrl() {
	    InstanceInfo instance = eurekaClient.getNextServerFromEureka("microservice-provider-user", false);
	    return instance.getHomePageUrl();
	}
	
	@RequestMapping(value = "discovery-instance",method = RequestMethod.GET)
	public ServiceInstance showInfo() {
		List<ServiceInstance> instances = discoveryClient.getInstances("microservice-provider-user");
		if (CollectionUtils.isNotEmpty(instances) ) {
	        return instances.get(0);
	    }
		return null;
	} 
}
