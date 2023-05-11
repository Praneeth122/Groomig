package com.sapient.grooming.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.annotations.Comment;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.sapient.grooming.model.User;
import com.sapient.grooming.request.UserRequest;
import com.sapient.grooming.response.UserResponse;

@Component
public class UserMapper {
	
	ModelMapper mapper =  new ModelMapper();
	
	public UserMapper() {
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.typeMap(User.class, UserRequest.class);
    }
	
	public User userRequestToUser(UserRequest request)
	{
		return mapper.map(request, User.class);
	}
	
	public UserResponse userToUserResponse(User user) {
		return mapper.map(user, UserResponse.class);
	}
	
	public List<UserResponse> userListToUserResponseList(List<User> userList){
		return userList.stream().map(this::userToUserResponse).collect(Collectors.toList());
	}
}
