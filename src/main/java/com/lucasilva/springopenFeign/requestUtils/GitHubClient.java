package com.lucasilva.springopenFeign.requestUtils;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.lucasilva.springopenFeign.dto.GitRepoUserModelResponse;
import com.lucasilva.springopenFeign.dto.GitUserModelResponse;

@FeignClient(url = "https://api.github.com", name = "GITHUB-CLIENT")
public interface GitHubClient {

	@GetMapping(value = "/users/{user}")
	GitUserModelResponse getUserGitHub(@PathVariable String user);
	
	@GetMapping(value = "/users/{user}/repos")
	List<GitRepoUserModelResponse> getRepoUserGitHub(@PathVariable String user);
}