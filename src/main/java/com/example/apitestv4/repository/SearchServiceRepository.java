package com.example.apitestv4.repository;

import com.example.apitestv4.model.TwitSearchResult;

import java.util.List;

public interface SearchServiceRepository {

    List<TwitSearchResult> getSearchResultsFor(String searchTerm);
}
