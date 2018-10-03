package com.example.apitestv4.service;

import com.example.apitestv4.model.SearchResult;

import java.util.List;

public interface SearchService {

    List<SearchResult> getSearchResultsFor(String searchTerm);

    void storeScheduledSearchResults(String searchTerm);
}
