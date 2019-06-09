package com.app.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//---------option args------------
		//read all keys
		Set<String> optionKeys = args.getOptionNames();
		System.out.println(optionKeys);
		
		//one key related value
		List<String> list = args.getOptionValues("profile");
		System.out.println(list);
		
		//check for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		//non option args
		List<String> nonop = args.getNonOptionArgs();
		System.out.println(nonop);
		
		//all args
		String[] arr = args.getSourceArgs();
		System.out.println(arr);
		

	}

}
