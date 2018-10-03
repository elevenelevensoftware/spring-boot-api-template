package com.example.apitestv4.repository.implementation;

import com.example.apitestv4.model.SearchResult;
import com.example.apitestv4.repository.SearchServiceRepository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SearchServiceRepositoryImplementation implements SearchServiceRepository {

    @Override
    public List<SearchResult> getSearchResultsFor(String searchTerm) {

        List<SearchResult> searchResults = new ArrayList<>();

        SearchResult searchResult = new SearchResult("result is here");
        searchResults.add(searchResult);

        return searchResults;
    }
}
