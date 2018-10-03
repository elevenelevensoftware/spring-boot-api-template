package com.example.apitestv4.service;

import com.example.apitestv4.model.TwitSearchResult;

import java.util.List;

public interface SearchService {

    List<TwitSearchResult> getSearchResultsFor(String searchTerm);

    void storeScheduledSearchResults(String searchTerm);
}
