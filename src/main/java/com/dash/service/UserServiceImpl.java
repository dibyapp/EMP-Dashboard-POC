package com.dash.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dash.model.User;
import com.dash.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> serachUsers(String keyword) {
		
//		return userRepository.searchUsers(keyword);
		return null;
	}
	
	@Override
	public Map<String, Integer> getMap() {
		List<User> users = userRepository.findAll();
		
		Date today = new Date();
		int day1 = 0,day2 = 0,day3 = 0,day4 = 0,day5 = 0,day6 = 0,day7 = 0,day8 = 0,day9 = 0,day10 = 0;
		
		for(User user : users) {
			if(user.getLastPresent().getYear()==today.getYear() && user.getLastPresent().getMonth()==today.getMonth()) {
				if(today.getDay()-user.getLastPresent().getDay() == 0) {
					day10++;
				}else if(today.getDay()-user.getLastPresent().getDay() == 1) {
					day9++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 2) {
					day8++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 3) {
					day7++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 4) {
					day6++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 5) {
					day5++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 6) {
					day4++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 7) {
					day3++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 8) {
					day2++;
				}
				else if(today.getDay()-user.getLastPresent().getDay() == 9) {
					day1++;
				}
			} 
		}
		
		Map<String, Integer> countM = new HashMap<String, Integer>();
		countM.put("day1", day1);
		countM.put("day2", day2);
		countM.put("day3", day3);
		countM.put("day4", day4);
		countM.put("day5", day5);
		countM.put("day6", day6);
		countM.put("day7", day7);
		countM.put("day8", day8);
		countM.put("day9", day9);
		countM.put("day10", day10);
		
		return countM;
	}
	
}
