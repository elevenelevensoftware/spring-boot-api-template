package com.example.apitestv4.repository;

import com.example.apitestv4.model.SearchResult;

import java.util.List;

public interface SearchServiceRepository {

    List<SearchResult> getSearchResultsFor(String searchTerm);
}
