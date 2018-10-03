package com.example.apitestv4.controller;

import com.example.apitestv4.model.TwitSearchResult;
import com.example.apitestv4.service.SearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/mainview")
@RestController
public class MainViewController {

    private SearchService searchService;

    @Autowired
    public MainViewController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/")
    public void getApiResult() {}

    @GetMapping("/search-for/{searchTerm}")
    public List<TwitSearchResult> getResultsFor(@PathVariable("searchTerm") String searchTerm) {
        return searchService.getSearchResultsFor(searchTerm);
    }
}
