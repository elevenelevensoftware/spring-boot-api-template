package com.example.apitestv4.repository.implementation;

import com.example.apitestv4.model.TwitSearchResult;
import com.example.apitestv4.repository.SearchServiceRepository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SearchServiceRepositoryImplementation implements SearchServiceRepository {

    @Override
    public List<TwitSearchResult> getSearchResultsFor(String searchTerm) {

        List<TwitSearchResult> twitSearchResults = new ArrayList<>();

        TwitSearchResult twitSearchResult = new TwitSearchResult("result is here");
        twitSearchResults.add(twitSearchResult);

        return twitSearchResults;
    }
}
