package com.lucasilva.springopenFeign.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lucasilva.springopenFeign.dto.GitRepoUserModelResponse;
import com.lucasilva.springopenFeign.dto.GitUserModelResponse;
import com.lucasilva.springopenFeign.requestUtils.GitHubClient;

@RestController
@RequestMapping(value = "/github")
public class GitHubResource {

	@Autowired
	private GitHubClient gitHubClient;
	
	@GetMapping(value = "/{user}")
	public GitUserModelResponse getUserGitHub(@PathVariable String user) {
		return gitHubClient.getUserGitHub(user);
	}
	
	@GetMapping(value = "/{user}/repos")
	public List<GitRepoUserModelResponse> getRepoUserGitHub(@PathVariable String user) {
		return gitHubClient.getRepoUserGitHub(user);
	}
}
