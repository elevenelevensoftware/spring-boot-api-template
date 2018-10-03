package com.example.apitestv4.service.implementation;

import com.example.apitestv4.model.TwitSearchResult;
import com.example.apitestv4.repository.SearchServiceRepository;
import com.example.apitestv4.service.SearchService;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImplementation implements SearchService {

    private static final String EXECUTE_ON_THE_HOUR_EVERY_HOUR = "0 * * * *";

    private SearchServiceRepository searchServiceRepository;

    public SearchServiceImplementation(SearchServiceRepository searchServiceRepository) {
        this.searchServiceRepository = searchServiceRepository;
    }

    @Override
    public List<TwitSearchResult> getSearchResultsFor(String searchTerm) {
        return searchServiceRepository.getSearchResultsFor(searchTerm);
    }

    @Scheduled(cron = EXECUTE_ON_THE_HOUR_EVERY_HOUR)
    @Override
    public void storeScheduledSearchResults(String searchTerm) {

        // hit the api with searchTerm

        // store the results
    }
}
